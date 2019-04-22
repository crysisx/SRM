package com.sxt.sys.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxt.commons.utils.Resp;
import com.sxt.sys.dto.RoleDto;
import com.sxt.sys.dto.UserDto;
import com.sxt.sys.pojo.User;
import com.sxt.sys.service.IUserService;

@Controller
@RequestMapping("/sys/user")
public class UserController {

	@Resource
	private IUserService userService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Map<String, Object> query(UserDto dto){
		PageInfo<User> page = userService.query(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getTotal());
		map.put("rows", page.getList());
		return map;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Resp save(UserDto dto){
		userService.save(dto);
		return Resp.success();
	}
}
