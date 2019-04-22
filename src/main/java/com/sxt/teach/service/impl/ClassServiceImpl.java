package com.sxt.teach.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.teach.dto.ClassesDto;
import com.sxt.teach.mapper.ClassBeanMapper;
import com.sxt.teach.pojo.ClassBean;
import com.sxt.teach.pojo.ClassBeanExample;
import com.sxt.teach.service.IClassService;

@Service
public class ClassServiceImpl implements IClassService {
	
	@Resource
	private ClassBeanMapper classMapper;

	@Override
	public PageInfo<ClassBean> query(ClassesDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getRows());
		ClassBeanExample example = new ClassBeanExample();
		List<ClassBean> list = classMapper.selectByExample(example );
		PageInfo<ClassBean> page = new PageInfo<>(list);
		return page;
	}

}
