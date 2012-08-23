package com.iary.event;

import com.iary.dci.data.aggregate.item.Item;
import com.lmax.disruptor.EventTranslator;

public class ItemEventTranslator implements EventTranslator<ItemEvent> {

	public Item item;
	private EventType type;

	public ItemEventTranslator(Item item, EventType type) {
		this.item = item;
		this.type = type;
	}

	@Override
	public void translateTo(ItemEvent event, long sequence) {
		event.setItem(item);
		event.setType(type);
		System.out.println("input [" + event.getItem().getId() + "] to seq" + sequence);
	}

}
