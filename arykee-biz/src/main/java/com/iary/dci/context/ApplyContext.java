package com.iary.dci.context;

import com.iary.dci.context.role.SellerUser;

public class ApplyContext implements Context {

	private SellerUser sellerUser;

	ApplyContext(Long userId) {
		this.sellerUser = new SellerUser(userId);
	}

	@Override
	public void doContext() {
		// TODO Auto-generated method stub

	}

}
