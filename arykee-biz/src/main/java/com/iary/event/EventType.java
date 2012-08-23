package com.iary.event;

/**
 * 操作类型
 * 
 * @author feiying.gh
 * 
 */
public enum EventType {

	INSERT(1, "新增"), UPDATE(2, "修改");

	private int value;
	private String description;

	private EventType(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

}
