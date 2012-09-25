package com.iary.dci.data.aggregate;

import com.iary.dci.context.role.Role;

public abstract class BaseAggregate<PK> implements Aggregate<PK> {

	private static final long serialVersionUID = -8248008473921087441L;

	@Override
	public Role assignRole(Class<? extends Role> role) {
        try {
			return (Role) role.newInstance().assign(this);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

}
