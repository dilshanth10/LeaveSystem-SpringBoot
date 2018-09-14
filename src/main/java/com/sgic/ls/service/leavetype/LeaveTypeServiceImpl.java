package com.sgic.ls.service.leavetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.LeaveType;

@Service
public class LeaveTypeServiceImpl implements LeaveTypeService{
	
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;

	@Override
	public Iterable<LeaveType> getAllLeaveTypes() {
		Iterable<LeaveType> leaveTypeList;
		leaveTypeList = leaveTypeRepository.findAll();
		return leaveTypeList;
	}

	@Override
	public void addLeaveType(LeaveType leaveType) {
		leaveTypeRepository.save(leaveType);
	}

	@Override
	public void deleteLeaveType(Integer id) {
		leaveTypeRepository.deleteById(id);
	}

	@Override
	public void updateLeaveType(Integer id, LeaveType leaveType) {
		LeaveType existLeaveType = leaveTypeRepository.getOne(id);
		existLeaveType.setLeaveType(leaveType.getLeaveType());
		existLeaveType.setAllocationPeriod(leaveType.getAllocationPeriod());
		leaveTypeRepository.save(existLeaveType);
	}
	
}
