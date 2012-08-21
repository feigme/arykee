package com.iary.dci.data.aggregate;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * ÷µ∂‘œÛ
 * 
 * @author feiying.gh
 * 
 */
public abstract class BaseValueObject implements ValueObject {

	private static final long serialVersionUID = 585431457759669786L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
