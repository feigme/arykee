package com.iary.dci.context;

import org.junit.Test;

import com.iary.dci.data.aggregate.item.Item;
import com.iary.dci.data.aggregate.item.ItemDetail;
import com.iary.dci.data.aggregate.user.User;
import com.iary.dci.data.aggregate.user.UserDetail;

public class ApplyContextTest {

	@Test
	public void testDoContext() {
		Long userId = 1L;
		UserDetail userDetail = new UserDetail();
		userDetail.setUserName("����");
		userDetail.setPassword("abc123");
		userDetail.setEmail("aaa@163.com");
		User user = new User(userDetail);
		user.setId(userId);

		ItemDetail itemDetail = new ItemDetail();
		itemDetail.setTitle("����");
		itemDetail.setPrice("10.50");
		itemDetail.setDescription("��ϸ���");
		Item item = new Item(itemDetail);

		RootContext.createApplyContext(user, item).doContext();

	}

}
