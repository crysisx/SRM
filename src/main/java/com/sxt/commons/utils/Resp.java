package com.sxt.commons.utils;

import java.io.Serializable;
import java.util.Map;

import org.springframework.http.HttpStatus;

/**
 * RestfulͳһJson��Ӧ�����װ
 * 
 * @author ������Ѽ
 * @email dengpbs@163.com
 *
 */
public class Resp implements Serializable {
	private static final long serialVersionUID = 1L;

	private final static String SUCCESS_CODE = "200";

	/**
	 * ����״̬��
	 */
	private String status;

	/**
	 * ������Ϣ
	 */
	private String message;

	/**
	 * ��������
	 */
	private Map<String, Object> ext;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getExt() {
		return ext;
	}

	public void setExt(Map<String, Object> ext) {
		this.ext = ext;
	}

	public Resp() {
		this.status = SUCCESS_CODE;
		this.message = "SUCCESS";
	}

	public Resp(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public Resp(String status, String message, Map<String, Object> ext) {
		this.status = status;
		this.message = message;
		this.ext = ext;
	}

	// ���ٷ��سɹ�
	public static Resp success() {
		return new Resp(SUCCESS_CODE, "����ɹ�", null);
	}
	
	public static Resp success(String message) {
		return new Resp(SUCCESS_CODE, message);
	}

	public static Resp success(String message, Map<String, Object> extra) {
		return new Resp(SUCCESS_CODE, message, extra);
	}

	// ���ٷ���ʧ��״̬
	public static Resp fail() {
		return new Resp(ErrorCode.SYSTEM_ERROR.getCode(), ErrorCode.SYSTEM_ERROR.getMessage());
	}
	
	public Resp fail(String message) {
		return new Resp(ErrorCode.SYSTEM_ERROR.getCode(), message);
	}

	public Resp fail(String message, Map<String, Object> extra) {
		return new Resp(ErrorCode.SYSTEM_ERROR.getCode(), message, extra);
	}

	public static Resp fail(ErrorCode errorCode) {
		return new Resp(errorCode.getCode(), errorCode.getMessage());
	}
	
	public static Resp fail(ErrorCode errorCode, String message) {
		return new Resp(errorCode.getCode(), message);
	}

	public static Resp fail(ErrorCode errorCode, String message, Map<String, Object> extra) {
		return new Resp(errorCode.getCode(), message, extra);
	}

	// ���ٷ����Զ���״̬��
	public static Resp result(String statusCode, String message) {
		return new Resp(statusCode, message);
	}

	public static Resp result(String statusCode, String message, Map<String, Object> extra) {
		return new Resp(statusCode, message, extra);
	}

	// ���ٷ���Http״̬
	public static Resp httpStatus(HttpStatus httpStatus, String message) {
		return result(httpStatus.toString(), message);
	}

}
