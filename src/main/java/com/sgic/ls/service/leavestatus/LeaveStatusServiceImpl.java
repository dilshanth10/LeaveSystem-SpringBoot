package com.sgic.ls.service.leavestatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.LeaveStatus;

@Service
public class LeaveStatusServiceImpl implements LeaveStatusService {

	@Autowired
	private LeaveStatusRepository leaveStatusRepository;

	@Override
	public Iterable<LeaveStatus> getAllLeaveStatus() {
		return leaveStatusRepository.findAll();
	}

	@Override
	public void addLeaveStatus(LeaveStatus leaveStatus) {
		leaveStatusRepository.save(leaveStatus);
	}

	@Override
	public void deleteLeaveStatus(Integer id) {
		leaveStatusRepository.deleteById(id);
	}

	@Override
	public void updateLeaveStatus(Integer id, LeaveStatus leaveStatus) {
		LeaveStatus existLeaveStatus = leaveStatusRepository.getOne(id);
		existLeaveStatus.setLeaveStatus(leaveStatus.getLeaveStatus());
		leaveStatusRepository.save(existLeaveStatus);
	}
}
