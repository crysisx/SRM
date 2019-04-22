package com.sxt.teach.service;

import com.github.pagehelper.PageInfo;
import com.sxt.teach.dto.ClassesDto;
import com.sxt.teach.pojo.ClassBean;

public interface IClassService {

	public PageInfo<ClassBean> query(ClassesDto dto);
}
