package com.iary.dci.context;

import com.iary.dci.data.aggregate.item.Item;
import com.iary.dci.data.aggregate.item.ItemDetail;
import com.iary.dci.interaction.ApplyInteraction;

public class ApplyContextTest {

	public void testDoContext() {
		Long userId = 1L;
		
		ItemDetail itemDetail = new ItemDetail();
		itemDetail.setTitle("²âÊÔ");
		itemDetail.setPrice("10.50");
		itemDetail.setDescription("ÏêÏ¸Çé¿ö");
		Item item = new Item(itemDetail);
		
		ApplyContext context = RootContext.createApplyContext(userId);
		context.doContext(new ApplyInteraction(item));

	}

}
