package com.sxt.sys.dto;

import com.sxt.sys.pojo.User;
import com.sxt.teach.pojo.Student;

/**
 * �û���Ϣ�������
 * @author ������Ѽ
 * @email dengpbs@163.com
 *
 */
public class UserDto extends User{
	
	private Student stu;

	// ҳ����1��ʼ
	private int page;
	
	// ÿҳ��¼�� ��ҳ������
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
