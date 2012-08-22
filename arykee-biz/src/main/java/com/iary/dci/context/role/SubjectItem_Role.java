package com.iary.dci.context.role;

import com.iary.dci.data.aggregate.Entity;
import com.iary.dci.data.aggregate.item.Item;

public class SubjectItem_Role implements Role {

	private Item item;

	public SubjectItem_Role() {
	}

	public SubjectItem_Role(Item item) {
		this.item = item;
	}

	@Override
	public Role assign(Entity<?> entity) {
		return new SubjectItem_Role((Item) entity);
	}

}
