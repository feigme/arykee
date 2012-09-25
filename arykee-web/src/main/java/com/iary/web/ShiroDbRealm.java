package com.iary.web;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.iary.tdl.dao.UserDAO;
import com.iary.tdl.dto.UserDTO;

public class ShiroDbRealm extends AuthorizingRealm {

	private UserDAO userDAO;

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
		UserDTO userDTO = userDAO.findUserDTOByLoginName(shiroUser.loginName);

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// for (Role role : user.getRoleList()) {
		// //基于Role的权限信息
		// info.addRole(role.getName());
		// //基于Permission的权限信息
		// info.addStringPermissions(role.getPermissionList());
		// }
		return info;
	}

	/**
	 * 认证回调函数,登录时调用
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		UserDTO userDTO = userDAO.findUserDTOByLoginName(token.getUsername());
		if (userDTO != null) {
			if (userDTO.getStatus().equals("disabled")) {
				throw new DisabledAccountException();
			}

			return new SimpleAuthenticationInfo(new ShiroUser(userDTO.getLoginName(), userDTO.getName()),
					userDTO.getPassword(), null, getName());
		} else {
			return null;
		}
	}

	/**
	 * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息.
	 */
	public static class ShiroUser implements Serializable {
		private static final long serialVersionUID = -1373760761780840081L;
		public String loginName;
		public String name;

		public ShiroUser(String loginName, String name) {
			this.loginName = loginName;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		/**
		 * 本函数输出将作为默认的<shiro:principal/>输出.
		 */
		@Override
		public String toString() {
			return loginName;
		}

		/**
		 * 重载equals,只计算loginName;
		 */
		@Override
		public int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this, "loginName");
		}

		/**
		 * 重载equals,只比较loginName
		 */
		@Override
		public boolean equals(Object obj) {
			return EqualsBuilder.reflectionEquals(this, obj, "loginName");
		}
	}

}
