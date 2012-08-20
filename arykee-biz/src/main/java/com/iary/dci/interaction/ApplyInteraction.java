package com.iary.dci.interaction;

import com.iary.dci.context.role.SubjectItem;
import com.iary.dci.data.aggregate.item.Item;

public class ApplyInteraction implements Interaction {

	private SubjectItem subjectItem;

	public ApplyInteraction(Item item) {
		this.subjectItem = new SubjectItem(item);
	}

}
