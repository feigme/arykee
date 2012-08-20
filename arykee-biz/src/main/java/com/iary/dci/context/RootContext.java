package com.iary.dci.context;

public class RootContext {

	public static ApplyContext createApplyContext(Long userId) {
		return new ApplyContext(userId);
	}

}
