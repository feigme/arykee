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
	 * ��Ȩ��ѯ�ص�����, ���м�Ȩ�����������û�����Ȩ��Ϣʱ����.
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
		UserDTO userDTO = userDAO.findUserDTOByLoginName(shiroUser.loginName);

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// for (Role role : user.getRoleList()) {
		// //����Role��Ȩ����Ϣ
		// info.addRole(role.getName());
		// //����Permission��Ȩ����Ϣ
		// info.addStringPermissions(role.getPermissionList());
		// }
		return info;
	}

	/**
	 * ��֤�ص�����,��¼ʱ����
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
	 * �Զ���Authentication����ʹ��Subject����Я���û��ĵ�¼���⻹����Я��������Ϣ.
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
		 * �������������ΪĬ�ϵ�<shiro:principal/>���.
		 */
		@Override
		public String toString() {
			return loginName;
		}

		/**
		 * ����equals,ֻ����loginName;
		 */
		@Override
		public int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this, "loginName");
		}

		/**
		 * ����equals,ֻ�Ƚ�loginName
		 */
		@Override
		public boolean equals(Object obj) {
			return EqualsBuilder.reflectionEquals(this, obj, "loginName");
		}
	}

}
