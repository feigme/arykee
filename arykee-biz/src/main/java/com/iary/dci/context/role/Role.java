package com.iary.dci.context.role;

import com.iary.dci.data.aggregate.Entity;

/**
 * ��ɫ
 * 
 * @author feiying.gh
 * 
 */
public interface Role {

	/**
	 * ����ɫ��ʵ��
	 * 
	 * @param entity
	 * @return
	 */
	Role assign(Entity<?> entity);

}
