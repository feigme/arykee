package com.iary.dci.context;

import com.iary.dci.context.role.SellerUser;
import com.iary.dci.context.role.SubjectItem;
import com.iary.dci.data.aggregate.item.Item;
import com.iary.dci.data.aggregate.user.User;
import com.iary.dci.interaction.ApplyInteraction;

public class ApplyContext implements Context {

	private User user;
	private Item item;

	ApplyContext(User user, Item item) {
		this.user = user;
		this.item = item;
	}

	@Override
	public void doContext() {
		SellerUser sellerUser = (SellerUser) user.assignRole(SellerUser.class);
		SubjectItem subjectItem = (SubjectItem) item.assignRole(SubjectItem.class);
		ApplyInteraction ai = new ApplyInteraction(sellerUser, subjectItem);
		ai.action();
	}

}
