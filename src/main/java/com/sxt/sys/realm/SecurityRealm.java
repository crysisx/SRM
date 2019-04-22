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
 * 认证和授权的自定义Realm
 * 
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class SecurityRealm extends AuthorizingRealm {

	@Resource
	private IUserService userService;

	/**
	 * 认证的方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获取提交的账号
		UsernamePasswordToken t = (UsernamePasswordToken) token;
		// 获取登录的账号
		String userName = t.getUsername();
		System.out.println("---->" + userName);
		User user = new User();
		user.setUsername(userName);
		List<User> list = userService.login(userName);
		if (list == null || list.size() != 1) {
			// 账号不存在或者用户过多都返回null
			return null;
		}
		user = list.get(0);
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), "bobo");
		return info;
	}

	/**
	 * 授权的方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
