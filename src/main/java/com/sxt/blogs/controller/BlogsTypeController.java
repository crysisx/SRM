package com.sxt.blogs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxt.blogs.dto.BlogsTypeDto;
import com.sxt.blogs.pojo.BlogsType;
import com.sxt.blogs.service.IBlogsTypeService;
import com.sxt.teach.dto.ClassesDto;

@Controller
@RequestMapping("/blogs/blogsType")
public class BlogsTypeController {

	@Resource
	private IBlogsTypeService blogsTypeService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Map<String,Object> query(BlogsTypeDto dto){
		PageInfo<BlogsType> page = blogsTypeService.query(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getTotal());
		map.put("rows", page.getList());
		return map;
	}
	@RequestMapping("/queryType")
	@ResponseBody
	public String queryType(int typeId){
		return blogsTypeService.queryType(typeId);
		
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<BlogsType> queryAll(){
		
		return blogsTypeService.queryAll();
	}
}
