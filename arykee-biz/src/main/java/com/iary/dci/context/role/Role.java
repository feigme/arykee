package com.iary.dci.context.role;

import com.iary.dci.data.aggregate.Entity;

/**
 * 角色
 * 
 * @author feiying.gh
 * 
 */
public interface Role {

	/**
	 * 赋角色给实体
	 * 
	 * @param entity
	 * @return
	 */
	Role assign(Entity<?> entity);

}
