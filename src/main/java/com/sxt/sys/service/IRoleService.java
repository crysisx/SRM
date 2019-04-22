package com.sxt.sys.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.sxt.sys.dto.RoleDto;
import com.sxt.sys.pojo.Role;
import com.sxt.sys.pojo.User;

public interface IRoleService {

	public PageInfo<Role> query(RoleDto dto);
	
	public void add(Role role);
	
	public void update(Role role);
	
	public void delete(int id);

	public List<Role> queryAll();

	public void save(RoleDto dto);
}
