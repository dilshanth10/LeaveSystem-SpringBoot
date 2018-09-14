package com.sgic.ls.service.leavetype;

import com.sgic.ls.entity.LeaveType;

public interface LeaveTypeService {
	
	public Iterable<LeaveType> getAllLeaveTypes();

	public void addLeaveType(LeaveType leaveType);

	public void deleteLeaveType(Integer id);

	public void updateLeaveType(Integer id, LeaveType leaveType);
}
