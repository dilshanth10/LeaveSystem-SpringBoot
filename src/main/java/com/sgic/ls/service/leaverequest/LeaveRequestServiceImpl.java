package com.sgic.ls.service.leaverequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.LeaveRequest;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{

	@Autowired
	private LeaveRequestRepository leaveRequestRepository;

	@Override
	public Iterable<LeaveRequest> getAllLeaveRequests() {
		return leaveRequestRepository.findAll();
	}
	
	@Override
	public void addLeaveRequest(LeaveRequest leaveRequest) {
		leaveRequestRepository.save(leaveRequest);
	}

	@Override
	public void deleteLeaveRequest(Integer id) {
		leaveRequestRepository.deleteById(id);
	}
	
	@Override
	public void updateLeaveRequest(Integer id, LeaveRequest leaveRequest) {
		LeaveRequest existLeaveRequest = leaveRequestRepository.getOne(id);
		existLeaveRequest.setUser(leaveRequest.getUser());
		existLeaveRequest.setLeaveStatus(leaveRequest.getLeaveStatus());
		existLeaveRequest.setLeave(leaveRequest.getLeave());
		existLeaveRequest.setFromTime(leaveRequest.getFromTime());
		existLeaveRequest.setToTime(leaveRequest.getToTime());
		leaveRequestRepository.save(existLeaveRequest);
	}

	@Override
	public List<LeaveRequest> findByUserNameAndAllocation(String firstName, float allocationPeriod) {
		return leaveRequestRepository.findByUserNameAndAllocation(firstName, allocationPeriod);
	}

}
