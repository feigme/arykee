package com.iary.tdl.dto;

import java.io.Serializable;

/**
 * 
 * @author feiying.gh
 * 
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 5999679580975626937L;

	private Long id;
	private String loginName;
	private String password;
	private String name;
	private String email;
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
