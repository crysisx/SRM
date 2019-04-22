package com.sxt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ҳ�������
 * @author ������Ѽ
 *
 * dengpbs@163.com
 */
@Controller
public class PageController {

	/**
	 * ��Ŀ¼����ת��login.jspҳ��
	 * @return
	 */
	@RequestMapping("/")
	public String showMain(){
		return "login";
	}
	
	/**
	 * restful ���
	 *    ���ݵ���ʲô���ݾ���ת����Ӧ��ҳ��
	 * @param path
	 * @return
	 */
	@RequestMapping("/{path}")
	public String showTop(@PathVariable String path){
		return path;
	}
	
	/**
	 * restful ���
	 *    ���ݵ���ʲô���ݾ���ת����Ӧ��ҳ��
	 * @param path
	 * @return
	 */
	@RequestMapping("/{path1}/{path2}/{path3}")
	public String showTop3(@PathVariable String path1,@PathVariable String path2,@PathVariable String path3){
		return path1+"/"+path2+"/"+path3;
	}
}
