package com.sxt.sys.realm;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.sxt.sys.pojo.User;
import com.sxt.sys.service.IUserService;
import com.sxt.teach.pojo.Student;

/**
 * ��֤����Ȩ���Զ���Realm
 * 
 * @author ������Ѽ
 * @email dengpbs@163.com
 *
 */
public class SecurityRealm extends AuthorizingRealm {

	@Resource
	private IUserService userService;

	/**
	 * ��֤�ķ���
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// ��ȡ�ύ���˺�
		UsernamePasswordToken t = (UsernamePasswordToken) token;
		// ��ȡ��¼���˺�
		String userName = t.getUsername();
		System.out.println("---->" + userName);
		User user = new User();
		user.setUsername(userName);
		List<User> list = userService.login(userName);
		if (list == null || list.size() != 1) {
			// �˺Ų����ڻ����û����඼����null
			return null;
		}
		user = list.get(0);
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), "bobo");
		return info;
	}

	/**
	 * ��Ȩ�ķ���
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
