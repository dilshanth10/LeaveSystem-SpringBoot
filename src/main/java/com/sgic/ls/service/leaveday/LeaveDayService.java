package com.sgic.ls.service.leaveday;

import com.sgic.ls.entity.LeaveDay;
import com.sgic.ls.entity.LeaveDayId;

public interface LeaveDayService {

	public Iterable<LeaveDay> getAllLeaveDays();

	public void addLeaveDay(LeaveDay leaveDay);

	public void deleteLeaveDay(LeaveDayId leavedayId);

	public void updateLeaveDay(LeaveDay leaveDay);
}
