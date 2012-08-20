package com.iary.dci.context;

import com.iary.dci.context.role.SellerUser;
import com.iary.dci.interaction.Interaction;

public class ApplyContext implements Context {

	private SellerUser sellerUser;

	ApplyContext(Long userId) {
		this.sellerUser = new SellerUser(userId);
	}

	@Override
	public void doContext(Interaction interaction) {
		
	}

}
