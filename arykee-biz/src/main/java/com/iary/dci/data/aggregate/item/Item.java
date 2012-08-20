package com.iary.dci.data.aggregate.item;

import com.iary.dci.data.aggregate.Aggregate;

public class Item implements Aggregate<Long> {

	private static final long serialVersionUID = 4949786562632751654L;

	private Long id;
	private ItemDetail itemDetail;

	public Item(ItemDetail itemDetail){
		this.itemDetail = itemDetail;
	}
	
	@Override
	public Long getId() {
		return id;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

}
