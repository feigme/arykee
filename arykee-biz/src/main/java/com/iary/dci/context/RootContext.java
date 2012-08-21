package com.iary.dci.context;

import com.iary.dci.data.aggregate.item.Item;
import com.iary.dci.data.aggregate.user.User;

/**
 * ¸ù³¡¾°
 * 
 * @author feiying.gh
 * 
 */
public class RootContext {

	public static ApplyContext createApplyContext(User user, Item item) {
		return new ApplyContext(user, item);
	}

}
