package com.sxt.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.sys.dto.RoleDto;
import com.sxt.sys.mapper.RoleMapper;
import com.sxt.sys.pojo.Role;
import com.sxt.sys.pojo.RoleExample;
import com.sxt.sys.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService{
	
	@Resource
	private RoleMapper roleMapper;

	@Override
	public PageInfo<Role> query(RoleDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getRows());
		RoleExample example = new RoleExample();
		List<Role> list = roleMapper.selectByExample(example );
		PageInfo<Role> page = new PageInfo<>(list);
		return page;
	}

	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> queryAll() {
		
		RoleExample example = new RoleExample();
		
		return roleMapper.selectByExample(example );
	}

	@Override
	public void save(RoleDto dto) {
		
		
	}

}
