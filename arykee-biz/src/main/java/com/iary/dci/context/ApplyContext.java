package com.iary.dci.context;

import com.iary.dci.context.role.SellerUser_Role;
import com.iary.dci.context.role.SubjectItem_Role;
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
		SellerUser_Role sellerUser = (SellerUser_Role) user.assignRole(SellerUser_Role.class);
		SubjectItem_Role subjectItem = (SubjectItem_Role) item.assignRole(SubjectItem_Role.class);
		ApplyInteraction ai = new ApplyInteraction(sellerUser, subjectItem);
		ai.action();
	}

}
