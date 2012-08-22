package com.iary.dci.data.aggregate.item;

import com.iary.dci.data.aggregate.Entity;

public class SubjectItem implements Entity<Long> {

	private static final long serialVersionUID = -5221199246325170964L;

	private Long id;

	@Override
	public Long getId() {
		return id;
	}

}
