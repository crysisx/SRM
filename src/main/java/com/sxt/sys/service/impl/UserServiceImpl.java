package com.sxt.sys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.sys.dto.UserDto;
import com.sxt.sys.mapper.UserMapper;
import com.sxt.sys.pojo.User;
import com.sxt.sys.pojo.UserExample;
import com.sxt.sys.service.IUserService;
import com.sxt.teach.mapper.StudentMapper;
import com.sxt.teach.pojo.Student;
import com.sxt.teach.pojo.StudentExample;

@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserMapper userMapper;
	@Resource
	private StudentMapper stuMapper;

	@Override
	public List<User> login(String userName) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(userName);
		List<User> list = userMapper.selectByExample(example );
		return list;
	}

	@Override
	public PageInfo<User> query(UserDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getRows());
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example );
		PageInfo<User> page = new PageInfo<>(list);
		return page;
	}

	@Override
	public Student queryStudentByUserId(Integer id) {
		StudentExample example = new StudentExample();
		example.createCriteria().andUserIdEqualTo(id);
		List<Student> list = stuMapper.selectByExample(example );
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(UserDto dto) {
		// 1.保存用户信息
		userMapper.insert(dto);
		// 2.保存用户和角色的对应信息
		Integer id = dto.getId();
		userMapper.insertUserAndRole(id,dto.getRoleId());
	}

}
