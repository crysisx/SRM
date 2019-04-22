package com.sxt.sys.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.sxt.sys.dto.UserDto;
import com.sxt.sys.pojo.User;
import com.sxt.teach.pojo.Student;

public interface IUserService {

	public List<User> login(String userName);
	
	public PageInfo<User> query(UserDto dto);

	public Student queryStudentByUserId(Integer id);

	public void save(UserDto dto);
}
