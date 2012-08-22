package com.iary.dci.interaction;

import com.iary.dci.context.role.SellerUser_Role;
import com.iary.dci.context.role.SubjectItem_Role;

public class ApplyInteraction implements Interaction {

	private SellerUser_Role sellerUser;
	private SubjectItem_Role subjectItem;

	public ApplyInteraction(SellerUser_Role sellerUser, SubjectItem_Role subjectItem) {
		this.sellerUser = sellerUser;
		this.subjectItem = subjectItem;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
