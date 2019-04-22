package com.sxt.teach.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxt.teach.dto.ClassesDto;
import com.sxt.teach.pojo.ClassBean;
import com.sxt.teach.service.IClassService;

@Controller
@RequestMapping("/teach/classes")
public class ClassController {

	@Resource
	private IClassService clsService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Map<String,Object> query(ClassesDto dto){
		PageInfo<ClassBean> page = clsService.query(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getTotal());
		map.put("rows", page.getList());
		return map;
	}
}
