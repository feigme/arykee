package com.iary.dci.context;

/**
 * �ִ�
 * 
 * @author feiying.gh
 * 
 * @param <T>
 * @param <PK>
 */
public interface Repository<T, PK> {

	/**
	 * ��������ȡ����
	 * 
	 * @param pk
	 * @return
	 */
	T get(PK pk);

}
