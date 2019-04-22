package com.sxt.teach.dto;

import com.sxt.teach.pojo.ClassBean;

public class ClassesDto extends ClassBean {

	// 页数从1开始
	private int page;

	// 每页记录数 分页的条数
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
