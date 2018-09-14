package com.sgic.ls.service.leavestatus;

import com.sgic.ls.entity.LeaveStatus;

public interface LeaveStatusService {

	public Iterable<LeaveStatus> getAllLeaveStatus();

	public void addLeaveStatus(LeaveStatus leaveStatus);

	public void deleteLeaveStatus(Integer id);

	public void updateLeaveStatus(Integer id, LeaveStatus leaveStatus);
}
