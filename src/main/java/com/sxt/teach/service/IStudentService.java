package com.sxt.teach.service;

import com.github.pagehelper.PageInfo;
import com.sxt.teach.dto.StudentDto;
import com.sxt.teach.pojo.Student;

public interface IStudentService {

	public PageInfo<Student> query(StudentDto dto);
}
