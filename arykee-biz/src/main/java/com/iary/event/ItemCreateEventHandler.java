package com.iary.event;

import com.lmax.disruptor.EventHandler;

public final class ItemCreateEventHandler implements EventHandler<ItemEvent> {

	@Override
	public void onEvent(ItemEvent event, long sequence, boolean endOfBatch) throws Exception {
		/*if(event.getType().equals(EventType.INSERT)){
			System.out.println("insert [" + event.getItem().getId() + "] from " + sequence);
		}else if(event.getType().equals(EventType.UPDATE)){
			System.out.println("update [" + event.getItem().getId() + "] from " + sequence);
		}*/
	}

}
