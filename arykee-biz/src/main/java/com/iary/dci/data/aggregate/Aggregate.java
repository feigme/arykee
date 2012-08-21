package com.iary.dci.data.aggregate;

import com.iary.dci.context.role.Role;

/**
 * �ۺ�
 * 
 * @author feiying.gh
 * 
 * @param <PK>
 */
public interface Aggregate<PK> extends Entity<PK> {

	/**
	 * ʵ����ݽ�ɫ
	 * 
	 * @param role
	 * @return
	 */
	Role assignRole(Class<? extends Role> role);

}
