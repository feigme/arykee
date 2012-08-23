package com.iary.event;

/**
 * ��������
 * 
 * @author feiying.gh
 * 
 */
public enum EventType {

	INSERT(1, "����"), UPDATE(2, "�޸�");

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
