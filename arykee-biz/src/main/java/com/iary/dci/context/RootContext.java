package com.iary.dci.context;

/**
 * ������
 * 
 * @author feiying.gh
 *
 */
public class RootContext {

	public static ApplyContext createApplyContext(Long userId) {
		return new ApplyContext(userId);
	}

}
