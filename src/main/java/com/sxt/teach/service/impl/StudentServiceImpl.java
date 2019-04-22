package com.sxt.teach.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.teach.dto.StudentDto;
import com.sxt.teach.mapper.StudentMapper;
import com.sxt.teach.pojo.Student;
import com.sxt.teach.pojo.StudentExample;
import com.sxt.teach.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
	
	@Resource
	private StudentMapper stuMapper;

	@Override
	public PageInfo<Student> query(StudentDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getRows());
		StudentExample example = new StudentExample();
		List<Student> list = stuMapper.selectByExample(example );
		PageInfo<Student> page = new PageInfo<>(list);
		return page;
	}

}
