package com.iary.disruptor.event;

import com.iary.dci.data.aggregate.item.Item;
import com.lmax.disruptor.EventTranslator;

public class CreateItemEventTranslator implements EventTranslator<CreateItemEvent> {

	public Item item;

	public CreateItemEventTranslator(Item item) {
		this.item = item;
	}

	@Override
	public void translateTo(CreateItemEvent event, long sequence) {
		event.setItem(item);
		System.out.println("input [" + event.getItem().getId() + "] to seq" + sequence);
	}

}
