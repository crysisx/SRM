package com.sxt.blogs.service;

import com.github.pagehelper.PageInfo;
import com.sxt.blogs.dto.BlogsDto;
import com.sxt.blogs.pojo.Blogs;

public interface IBlogsService {

	public PageInfo<Blogs> query(BlogsDto dto);

	public void save(Blogs blogs);
}
