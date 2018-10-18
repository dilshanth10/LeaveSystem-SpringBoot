package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.Leave;
import com.sgic.ls.service.leave.LeaveService;

@RestController
public class LeaveController {

	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/leave")
	public Iterable<Leave> getAllRoles() {
		return leaveService.getAllLeaveTypes();
	}
	
	@PostMapping("/leave")
	public void addleave(@RequestBody Leave leave) {
//	 Leave leave = leaveDTOMapping.getLeave(leaveDto)
		leaveService.addLeaveType(leave);
	}

	@DeleteMapping("/leave/{id}")
	public void deleteleave(@PathVariable Integer id) {
		leaveService.deleteLeaveType(id);
	}

	@PutMapping("/leave/{id}")
	public void updateleave(@PathVariable Integer id, @RequestBody Leave leave) {
		leaveService.updateLeaveType(id, leave);
	}
}
