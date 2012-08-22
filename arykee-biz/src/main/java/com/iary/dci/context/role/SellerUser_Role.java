package com.iary.dci.context.role;

import com.iary.dci.data.aggregate.Entity;
import com.iary.dci.data.aggregate.user.User;

public class SellerUser_Role implements Role {

	private User user;

	public SellerUser_Role() {
	}

	public SellerUser_Role(User user) {
		this.user = user;
	}

	@Override
	public Role assign(Entity<?> entity) {
		return new SellerUser_Role((User) entity);
	}

}
