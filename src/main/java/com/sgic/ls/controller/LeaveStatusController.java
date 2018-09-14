package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.LeaveStatus;
import com.sgic.ls.service.leavestatus.LeaveStatusService;

@RestController
public class LeaveStatusController {
	@Autowired
	private LeaveStatusService leaveStatusService;

	@GetMapping("/leavestatus")
	public Iterable<LeaveStatus> getAllLeaveStatus() {
		return leaveStatusService.getAllLeaveStatus();
	}

	@PostMapping("/leavestatus")
	public void addLeaveStatus(@RequestBody LeaveStatus leaveStatus) {
		leaveStatusService.addLeaveStatus(leaveStatus);
	}

	@DeleteMapping("/leavestatus/{id}")
	public void deleteLeaveStatus(@PathVariable Integer id) {
		leaveStatusService.deleteLeaveStatus(id);
	}

	@PutMapping("/leavestatus/{id}")
	public void updateLeaveStatus(@PathVariable Integer id, @RequestBody LeaveStatus leaveStatus) {
		leaveStatusService.updateLeaveStatus(id, leaveStatus);
	}

}
