package com.sgic.ls.service.leaveday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.LeaveDay;
import com.sgic.ls.entity.LeaveDayId;

@Service
public class LeaveDayServiceImpl implements LeaveDayService{

	@Autowired
	private LeaveDayRepository LeaveDayRepository;

	@Override
	public Iterable<LeaveDay> getAllLeaveDays() {
		return LeaveDayRepository.findAll();
	}
	
	@Override
	public void addLeaveDay(LeaveDay LeaveDay) {
		LeaveDayRepository.save(LeaveDay);
	}

	@Override
	public void deleteLeaveDay(LeaveDayId leavedayId) {
		LeaveDayRepository.deleteById(leavedayId);
	}
	
	@Override
	public void updateLeaveDay(LeaveDay leaveDay) {
		LeaveDay existLeaveDay = LeaveDayRepository.getOne(leaveDay.getId());
		existLeaveDay.setLeaveDays(leaveDay.getLeaveDays());
		LeaveDayRepository.save(existLeaveDay);
	}
}
