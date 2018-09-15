package com.sgic.ls.service.leave;

import com.sgic.ls.entity.Leave;

public interface LeaveService {
	
	public Iterable<Leave> getAllLeaveTypes();

	public void addLeaveType(Leave leaveType);

	public void deleteLeaveType(Integer id);

	public void updateLeaveType(Integer id, Leave leaveType);
}
