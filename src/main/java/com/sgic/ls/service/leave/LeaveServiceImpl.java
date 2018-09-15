package com.sgic.ls.service.leave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.Leave;

@Service
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired
	private LeaveRepository leaveTypeRepository;

	@Override
	public Iterable<Leave> getAllLeaveTypes() {
		Iterable<Leave> leaveTypeList;
		leaveTypeList = leaveTypeRepository.findAll();
		return leaveTypeList;
	}

	@Override
	public void addLeaveType(Leave leaveType) {
		leaveTypeRepository.save(leaveType);
	}

	@Override
	public void deleteLeaveType(Integer id) {
		leaveTypeRepository.deleteById(id);
	}

	@Override
	public void updateLeaveType(Integer id, Leave leaveType) {
		Leave existLeaveType = leaveTypeRepository.getOne(id);
		existLeaveType.setLeaveType(leaveType.getLeaveType());
		existLeaveType.setAllocationPeriod(leaveType.getAllocationPeriod());
		leaveTypeRepository.save(existLeaveType);
	}
	
}
