package com.sgic.ls.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="leaveschema", name="leave_status")
public class LeaveStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String leaveStatus;

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
