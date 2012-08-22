package com.iary.dci.data.aggregate.item;

import com.iary.dci.data.aggregate.BaseAggregate;

public class Item extends BaseAggregate<Long> {

	private static final long serialVersionUID = 4949786562632751654L;

	private Long id;
	private ItemDetail itemDetail;

	public Item(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

}
