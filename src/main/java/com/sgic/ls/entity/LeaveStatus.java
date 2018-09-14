package com.sgic.ls.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveStatus {
	@Id
	Integer id;
	String leaveStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

}
