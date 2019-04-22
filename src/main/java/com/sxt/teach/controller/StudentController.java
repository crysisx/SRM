package com.sxt.teach.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sxt.teach.dto.StudentDto;
import com.sxt.teach.pojo.Student;
import com.sxt.teach.service.IStudentService;

@Controller
@RequestMapping("/teach/student")
public class StudentController {

	@Resource
	private IStudentService stuService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Map<String,Object> query(StudentDto dto){
		PageInfo<Student> page = stuService.query(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getTotal());
		map.put("rows", page.getList());
		return map;
	}
}
