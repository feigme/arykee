package com.iary.disruptor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.iary.dci.data.aggregate.item.Item;
import com.iary.dci.data.aggregate.item.ItemDetail;
import com.iary.event.EventType;
import com.iary.event.ItemCreateEventHandler;
import com.iary.event.ItemEvent;
import com.iary.event.ItemEventTranslator;
import com.lmax.disruptor.SingleThreadedClaimStrategy;
import com.lmax.disruptor.SleepingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;

public class DisruptorTest {

	@Test
	public void testCreateItem() {
		Executor executor = Executors.newSingleThreadExecutor();
		Disruptor<ItemEvent> disruptor = new Disruptor<ItemEvent>(ItemEvent.EVENT_FACTORY, executor,
				new SingleThreadedClaimStrategy(1 << 4), new SleepingWaitStrategy());
		ItemCreateEventHandler handler = new ItemCreateEventHandler();
		disruptor.handleEventsWith(handler);
		disruptor.start();

		Item item = new Item(new ItemDetail());
		item.setId(1L);
		disruptor.publishEvent(new ItemEventTranslator(item, EventType.INSERT));

		item = new Item(new ItemDetail());
		item.setId(2L);
		disruptor.publishEvent(new ItemEventTranslator(item, EventType.UPDATE));
	}
}
