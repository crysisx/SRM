package com.sxt.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxt.commons.utils.Resp;
import com.sxt.sys.dto.RoleDto;
import com.sxt.sys.pojo.Role;
import com.sxt.sys.service.IRoleService;

@Controller
@RequestMapping("/sys/role")
public class RoleController {

	@Resource
	private IRoleService roleService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Map<String, Object> query(RoleDto dto){
		PageInfo<Role> page = roleService.query(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getTotal());
		map.put("rows", page.getList());
		return map;
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Role> queryAll(){
		
		return roleService.queryAll();
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Resp save(RoleDto dto){
		roleService.save(dto);
		return Resp.success();
	}
	
}
