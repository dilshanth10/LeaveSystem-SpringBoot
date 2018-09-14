package com.sgic.ls.service.leaverequest;

import com.sgic.ls.entity.LeaveRequest;

public interface LeaveRequestService {

	public Iterable<LeaveRequest> getAllLeaveRequests();

	public void addLeaveRequest(LeaveRequest leaveRequest);

	public void deleteLeaveRequest(Integer id);

	public void updateLeaveRequest(Integer id, LeaveRequest leaveRequest);
}
