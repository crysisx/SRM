package com.sxt.blogs.dto;

import com.sxt.blogs.pojo.BlogsType;

public class BlogsTypeDto extends BlogsType {

	// ҳ����1��ʼ
	private int page;

	// ÿҳ��¼�� ��ҳ������
	private int rows;

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
}
