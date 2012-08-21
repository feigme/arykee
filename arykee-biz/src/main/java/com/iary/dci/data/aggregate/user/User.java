package com.iary.dci.data.aggregate.user;

import com.iary.dci.data.aggregate.BaseAggregate;

public class User extends BaseAggregate<Long> {

	private static final long serialVersionUID = 2878940999188195679L;

	private Long id;
	private UserDetail userDetail;

	public User(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

}
