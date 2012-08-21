package com.iary.dci.interaction;

import com.iary.dci.context.role.SellerUser;
import com.iary.dci.context.role.SubjectItem;

public class ApplyInteraction implements Interaction {

	private SellerUser sellerUser;
	private SubjectItem subjectItem;

	public ApplyInteraction(SellerUser sellerUser, SubjectItem subjectItem) {
		this.sellerUser = sellerUser;
		this.subjectItem = subjectItem;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
