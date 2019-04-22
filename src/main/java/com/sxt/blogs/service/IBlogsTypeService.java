package com.sxt.blogs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sxt.blogs.dto.BlogsTypeDto;
import com.sxt.blogs.pojo.BlogsType;

public interface IBlogsTypeService {

	public PageInfo<BlogsType> query(BlogsTypeDto dto);

	public String queryType(int typeId);

	public List<BlogsType> queryAll();
}
