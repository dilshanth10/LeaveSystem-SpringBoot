package com.sgic.ls.criteria;

public class UserCriteria {

	private String firstName;
	private String leaveType;
	private float leaveAllocation;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public float getLeaveAllocation() {
		return leaveAllocation;
	}
	public void setLeaveAllocation(Float leaveAllocation) {
		this.leaveAllocation = leaveAllocation;
	}
}
