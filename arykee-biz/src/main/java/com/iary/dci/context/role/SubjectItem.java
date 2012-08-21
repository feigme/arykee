package com.iary.dci.context.role;

import java.util.Date;

import net.sf.cglib.proxy.Mixin;

import com.iary.dci.data.aggregate.Entity;
import com.iary.dci.data.aggregate.item.Item;

public class SubjectItem implements Role {

	private String subjectPrice;
	private Date subjectStartTime;
	private Date subjectEndTime;

	public SubjectItem() {
	}

	public SubjectItem(Item item) {
		Mixin.create(new Object[] { this, item });
	}

	public String getSubjectPrice() {
		return subjectPrice;
	}

	public Date getSubjectStartTime() {
		return subjectStartTime;
	}

	public Date getSubjectEndTime() {
		return subjectEndTime;
	}

	@Override
	public Role assign(Entity<?> entity) {
		return new SubjectItem((Item) entity);
	}

}
