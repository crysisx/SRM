package com.sxt.blogs.dto;

import com.sxt.blogs.pojo.Blogs;

public class BlogsDto extends Blogs {
	// 页数从1开始
	private int page;

	// 每页记录数 分页的条数
	private int rows;
	
	// 博客类型名称
	private String blogsTypeName;
	
	// 博客所属的学生姓名
	private String studentName;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getBlogsTypeName() {
		return blogsTypeName;
	}

	public void setBlogsTypeName(String blogsTypeName) {
		this.blogsTypeName = blogsTypeName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
