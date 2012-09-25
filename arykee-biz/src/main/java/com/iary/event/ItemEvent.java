package com.iary.event;

import com.iary.dci.data.aggregate.item.Item;
import com.lmax.disruptor.EventFactory;

public final class ItemEvent {

	private Item item;

	public final static EventFactory<ItemEvent> EVENT_FACTORY = new EventFactory<ItemEvent>() {

		@Override
		public ItemEvent newInstance() {
			return new ItemEvent();
		}

	};

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
