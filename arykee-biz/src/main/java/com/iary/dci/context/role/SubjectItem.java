package com.iary.dci.context.role;

import net.sf.cglib.proxy.Mixin;

import com.iary.dci.data.aggregate.item.Item;

public class SubjectItem {

	private String subjectPrice;

	SubjectItem(Item item) {
		Mixin.create(new Object[] { item, this });
	}

	public String getSubjectPrice() {
		return subjectPrice;
	}

}
