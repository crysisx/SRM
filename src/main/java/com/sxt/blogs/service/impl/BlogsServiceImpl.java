package com.sxt.blogs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.blogs.dto.BlogsDto;
import com.sxt.blogs.mapper.BlogsMapper;
import com.sxt.blogs.pojo.Blogs;
import com.sxt.blogs.pojo.BlogsExample;
import com.sxt.blogs.service.IBlogsService;
@Service
public class BlogsServiceImpl implements IBlogsService {
	
	@Resource
	private BlogsMapper blogsMapper;

	@Override
	public PageInfo<Blogs> query(BlogsDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getRows());
		BlogsExample example = new BlogsExample();
		List<Blogs> list = blogsMapper.selectByView(example);
		PageInfo<Blogs> page = new PageInfo<>(list);
		return page;
	}

	@Override
	public void save(Blogs blogs) {
		// TODO Auto-generated method stub
		blogsMapper.insert(blogs);
	}

}
