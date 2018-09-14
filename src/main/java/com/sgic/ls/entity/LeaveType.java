package com.sgic.ls.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveType {

	@Id
	private Integer id;
	private String leaveType;
	private float allocationPeriod;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public float getAllocationPeriod() {
		return allocationPeriod;
	}

	public void setAllocationPeriod(float allocationPeriod) {
		this.allocationPeriod = allocationPeriod;
	}

}
