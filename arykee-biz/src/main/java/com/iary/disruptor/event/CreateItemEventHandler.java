package com.iary.disruptor.event;

import com.lmax.disruptor.EventHandler;

public final class CreateItemEventHandler implements EventHandler<CreateItemEvent> {

	@Override
	public void onEvent(CreateItemEvent event, long sequence, boolean endOfBatch) throws Exception {
		System.out.println("output [" + event.getItem().getId() + "] from " + sequence);
	}

}
