package com.iary.dci.data.aggregate.user;

import com.iary.dci.data.aggregate.Aggregate;

public class User implements Aggregate<Long> {

	private static final long serialVersionUID = 2878940999188195679L;

	private Long id;
	private UserDetail detail;

	@Override
	public Long getId() {
		return id;
	}

	public UserDetail getDetail() {
		return detail;
	}

}
