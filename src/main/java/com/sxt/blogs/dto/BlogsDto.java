package com.sxt.blogs.dto;

import com.sxt.blogs.pojo.Blogs;

public class BlogsDto extends Blogs {
	// ҳ����1��ʼ
	private int page;

	// ÿҳ��¼�� ��ҳ������
	private int rows;
	
	// ������������
	private String blogsTypeName;
	
	// ����������ѧ������
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
