package com.iary.dci.data.aggregate.item;

import com.iary.dci.data.aggregate.ValueObject;

public class ItemDetail implements ValueObject {

	private static final long serialVersionUID = -7706672246334842699L;

	private String title;
	private String price;
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
