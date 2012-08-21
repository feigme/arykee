package com.iary.dci.context;

/**
 * 仓储
 * 
 * @author feiying.gh
 * 
 * @param <T>
 * @param <PK>
 */
public interface Repository<T, PK> {

	/**
	 * 根据主键取对象
	 * 
	 * @param pk
	 * @return
	 */
	T get(PK pk);

}
