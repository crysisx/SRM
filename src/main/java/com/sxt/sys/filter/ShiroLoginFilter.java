package com.sxt.sys.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.sxt.commons.utils.ErrorCode;
import com.sxt.commons.utils.Resp;
/**
 * ������֤�������
 * @author ������Ѽ
 * @email dengpbs@163.com
 *
 */
public class ShiroLoginFilter extends FormAuthenticationFilter{
	
	private static final Logger log = LoggerFactory.getLogger(FormAuthenticationFilter.class);

	 /**
     * ��ʾ�����ʾܾ�ʱ
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        if(this.isLoginRequest(request, response)) {
            if(this.isLoginSubmission(request, response)) {
                if(log.isTraceEnabled()) {
                    log.trace("Login submission detected.  Attempting to execute login.");
                }

                return this.executeLogin(request, response);
            } else {
                if(log.isTraceEnabled()) {
                    log.trace("Login page view.");
                }

                return true;
            }
        } else {
            if(log.isTraceEnabled()) {
                log.trace("Attempting to access a path which requires authentication.  Forwarding to the Authentication url [" + this.getLoginUrl() + "]");
            }

            this.saveRequestAndRedirectToLogin(request, response);
            return false;
        }
    }

    /**
     * 
     * ����¼�ɹ�
     * 
     * @param token
     * @param subject
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String requestType = ((HttpServletRequest)request).getHeader("X-Requested-With"); 
        System.out.println("���ʳɹ�....");
        if (requestType==null){// ����ajax����
        	System.out.println("���ʳɹ�....1");
            issueSuccessRedirect(request, response);
        } else {
        	System.out.println("���ʳɹ�....2");
            httpServletResponse.setCharacterEncoding("UTF-8");
            PrintWriter out = httpServletResponse.getWriter();
            out.println(JSONObject.toJSON(Resp.success()));
            out.flush();
            out.close();
        }
        return false;
    }

    /**
     * 
     * ����¼ʧ��
     * 
     * @param token
     * @param e
     * @param request
     * @param response
     * @return
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        System.out.println("����ʧ��...");
    	String requestType = ((HttpServletRequest)request).getHeader("X-Requested-With"); 
    	System.out.println("����ʧ��..."+requestType);
    	if (requestType==null) {// ����ajax����
    		System.out.println("����ʧ��...1");
            setFailureAttribute(request, e);
            return true;
        }
        try {
        	System.out.println("����ʧ��...2");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            String message = e.getClass().getSimpleName();
            String info = null;
            if ("IncorrectCredentialsException".equals(message)) {
                info = "�������";
            } else if ("UnknownAccountException".equals(message)) {
                info = "�˺Ų�����";
            } else if ("LockedAccountException".equals(message)) {
                info = "�˺ű�����";
            } else {
                info = "δ֪����";
            }
            out.println(JSONObject.toJSON(Resp.fail(ErrorCode.SYSTEM_ERROR, info)));
            out.flush();
            out.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return false;
    }
}
