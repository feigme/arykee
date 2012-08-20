package com.iary.dci.data.aggregate.user;

import com.iary.dci.data.aggregate.BaseValueObject;

public class UserDetail extends BaseValueObject {

	private static final long serialVersionUID = 3560046792635233807L;

	private String userName;
	private String password;
	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

}
