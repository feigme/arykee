package com.iary.disruptor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.iary.dci.data.aggregate.item.Item;
import com.iary.dci.data.aggregate.item.ItemDetail;
import com.iary.disruptor.event.CreateItemEvent;
import com.iary.disruptor.event.CreateItemEventHandler;
import com.iary.disruptor.event.CreateItemEventTranslator;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.SingleThreadedClaimStrategy;
import com.lmax.disruptor.SleepingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;

public class DisruptorTest {

	@Test
	public void testCreateItem() {
		Executor executor = Executors.newSingleThreadExecutor();
		Disruptor<CreateItemEvent> disruptor = new Disruptor<CreateItemEvent>(CreateItemEvent.EVENT_FACTORY, executor,
				new SingleThreadedClaimStrategy(1 << 4), new SleepingWaitStrategy());
		disruptor.handleEventsWith(new CreateItemEventHandler());
		RingBuffer<CreateItemEvent> ringBuffer = disruptor.start();		
		
		Item item = new Item(new ItemDetail());
		item.setId(1L);
		disruptor.publishEvent(new CreateItemEventTranslator(item));
		
		item = new Item(new ItemDetail());
		item.setId(2L);
		disruptor.publishEvent(new CreateItemEventTranslator(item));
	}
}
