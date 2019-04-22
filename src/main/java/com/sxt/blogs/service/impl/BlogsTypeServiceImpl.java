package com.sxt.blogs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.blogs.dto.BlogsTypeDto;
import com.sxt.blogs.mapper.BlogsTypeMapper;
import com.sxt.blogs.pojo.BlogsType;
import com.sxt.blogs.pojo.BlogsTypeExample;
import com.sxt.blogs.service.IBlogsTypeService;

@Service
public class BlogsTypeServiceImpl implements IBlogsTypeService {
	
	@Resource
	private BlogsTypeMapper blogsTypeMapper;

	@Override
	public PageInfo<BlogsType> query(BlogsTypeDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getRows());
		BlogsTypeExample example = new BlogsTypeExample();
		List<BlogsType> list = blogsTypeMapper.selectByExample(example );
		PageInfo<BlogsType> page = new PageInfo<>(list);
		return page;
	}

	@Override
	public String queryType(int typeId) {
		BlogsType type = blogsTypeMapper.selectByPrimaryKey(typeId);
		if(type != null){
			return type.getBlogsTypeName();
		}
		return null;
	}

	@Override
	public List<BlogsType> queryAll() {
		BlogsTypeExample example = new BlogsTypeExample();
		blogsTypeMapper.selectByExample(example );
		return blogsTypeMapper.selectByExample(example );
	}

}
