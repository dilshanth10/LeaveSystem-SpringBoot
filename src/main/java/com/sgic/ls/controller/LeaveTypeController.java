package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.LeaveType;
import com.sgic.ls.service.leavetype.LeaveTypeService;

@RestController
public class LeaveTypeController {

	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@GetMapping("/leavetype")
	public Iterable<LeaveType> getAllRoles() {
		return leaveTypeService.getAllLeaveTypes();
	}
	
	@PostMapping("/leavetype")
	public void addLeaveType(@RequestBody LeaveType leaveType) {
		leaveTypeService.addLeaveType(leaveType);
	}

	@DeleteMapping("/leavetype/{id}")
	public void deleteLeaveType(@PathVariable Integer id) {
		leaveTypeService.deleteLeaveType(id);
	}

	@PutMapping("/leavetype/{id}")
	public void updateLeaveType(@PathVariable Integer id, @RequestBody LeaveType leaveType) {
		leaveTypeService.updateLeaveType(id, leaveType);
	}
}
