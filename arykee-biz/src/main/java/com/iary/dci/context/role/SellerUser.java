package com.iary.dci.context.role;

import com.iary.dci.data.aggregate.Entity;
import com.iary.dci.data.aggregate.user.User;

public class SellerUser implements Role {

	private User user;

	public SellerUser() {
	}

	public SellerUser(User user) {
		this.user = user;
	}

	@Override
	public Role assign(Entity<?> entity) {
		return new SellerUser((User) entity);
	}

}
