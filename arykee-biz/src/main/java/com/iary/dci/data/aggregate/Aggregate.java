package com.iary.dci.data.aggregate;

import com.iary.dci.context.role.Role;

/**
 * 聚合
 * 
 * @author feiying.gh
 * 
 * @param <PK>
 */
public interface Aggregate<PK> extends Entity<PK> {

	/**
	 * 实体扮演角色
	 * 
	 * @param role
	 * @return
	 */
	Role assignRole(Class<? extends Role> role);

}
