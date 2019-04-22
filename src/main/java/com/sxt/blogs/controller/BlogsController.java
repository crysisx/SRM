package com.sxt.blogs.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxt.blogs.dto.BlogsDto;
import com.sxt.blogs.pojo.Blogs;
import com.sxt.blogs.service.IBlogsService;
import com.sxt.commons.utils.Resp;
import com.sxt.sys.pojo.User;
import com.sxt.sys.service.IUserService;
import com.sxt.teach.pojo.Student;

@Controller
@RequestMapping("/blogs/blogs")
public class BlogsController {

	@Resource
	private IBlogsService blogsService;
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Map<String,Object> query(BlogsDto dto){
		PageInfo<Blogs> page = blogsService.query(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getTotal());
		map.put("rows", page.getList());
		return map;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Resp save(Blogs blogs){
		// 获取当前的学生信息
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		// 根据userId查询是否有学生信息
		Student stu = userService.queryStudentByUserId(user.getId());
		if(stu!=null){
			blogs.setStuId(stu.getStuId());
		}	
		blogs.setCreateTime(new Date());
		blogsService.save(blogs);
		return Resp.success();
		
	}
}
