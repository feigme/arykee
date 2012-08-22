package com.iary.dci.data.aggregate.item;

import java.util.Date;

import com.iary.dci.data.aggregate.BaseValueObject;

public class SubjectItemDetail extends BaseValueObject {

	private static final long serialVersionUID = 9131933056463714692L;

	private String subjectPrice;
	private Date subjectStartTime;
	private Date subjectEndTime;

	public String getSubjectPrice() {
		return subjectPrice;
	}

	public void setSubjectPrice(String subjectPrice) {
		this.subjectPrice = subjectPrice;
	}

	public Date getSubjectStartTime() {
		return subjectStartTime;
	}

	public void setSubjectStartTime(Date subjectStartTime) {
		this.subjectStartTime = subjectStartTime;
	}

	public Date getSubjectEndTime() {
		return subjectEndTime;
	}

	public void setSubjectEndTime(Date subjectEndTime) {
		this.subjectEndTime = subjectEndTime;
	}
}
