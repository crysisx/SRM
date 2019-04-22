package com.sxt.sys.dto;

import com.sxt.sys.pojo.User;
import com.sxt.teach.pojo.Student;

/**
 * 用户信息传输对象
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class UserDto extends User{
	
	private Student stu;

	// 页数从1开始
	private int page;
	
	// 每页记录数 分页的条数
	private int rows;
	
	private Integer roleId;

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

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
