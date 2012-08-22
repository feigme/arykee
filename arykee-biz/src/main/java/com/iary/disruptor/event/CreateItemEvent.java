package com.iary.disruptor.event;

import com.iary.dci.data.aggregate.item.Item;
import com.lmax.disruptor.EventFactory;

public final class CreateItemEvent {

	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(final Item item) {
		this.item = item;
	}

	public final static EventFactory<CreateItemEvent> EVENT_FACTORY = new EventFactory<CreateItemEvent>() {

		@Override
		public CreateItemEvent newInstance() {
			return new CreateItemEvent();
		}

	};
}
