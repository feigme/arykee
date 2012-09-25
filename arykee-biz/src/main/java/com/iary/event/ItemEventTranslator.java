package com.iary.event;

import com.iary.dci.data.aggregate.item.Item;
import com.lmax.disruptor.EventTranslator;

public class ItemEventTranslator implements EventTranslator<ItemEvent> {

	public Item item;

	public ItemEventTranslator(Item item) {
		this.item = item;
	}

	@Override
	public void translateTo(ItemEvent event, long sequence) {
		event.setItem(item);
		System.out.println("input [" + event.getItem().getId() + "] to seq" + sequence);
	}

}
