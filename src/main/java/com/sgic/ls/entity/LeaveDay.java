package com.sgic.ls.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(schema="leaveschema", name="leave_day")
public class LeaveDay {
//	@Id
//	@OneToOne
//	private User user;
//	@Id
//	@OneToOne
//	private LeaveType leaveType;
	
	@EmbeddedId
	private LeaveDayId id;
	
	private float leaveDays;

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public LeaveType getLeaveType() {
//		return leaveType;
//	}
//
//	public void setLeaveType(LeaveType leaveType) {
//		this.leaveType = leaveType;
//	}

	public float getLeaveDays() {
		return leaveDays;
	}

	public LeaveDayId getId() {
		return id;
	}

	public void setId(LeaveDayId id) {
		this.id = id;
	}

	public void setLeaveDays(float leaveDays) {
		this.leaveDays = leaveDays;
	}
}
