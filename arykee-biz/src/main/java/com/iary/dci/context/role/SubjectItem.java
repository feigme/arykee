package com.iary.dci.context.role;

import net.sf.cglib.proxy.Mixin;

import com.iary.dci.data.aggregate.item.Item;

public class SubjectItem {

	private String subjectPrice;

	public SubjectItem(Item item) {
		Mixin.create(new Object[] { this, item });
	}

	public String getSubjectPrice() {
		return subjectPrice;
	}

}
