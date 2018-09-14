package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.LeaveRequest;
import com.sgic.ls.service.leaverequest.LeaveRequestService;

@RestController
public class LeaveRequestController {
	
	@Autowired
	private LeaveRequestService leaveRequestService;

	@GetMapping("/leaverequest")
	public Iterable<LeaveRequest> getAllLeaveRequests() {
		return leaveRequestService.getAllLeaveRequests();
	}

	@PostMapping("/leaverequest")
	public void addLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
		leaveRequestService.addLeaveRequest(leaveRequest);;
	}

	@DeleteMapping("/leaverequest/{id}")
	public void deleteLeaveRequest(@PathVariable Integer id) {
		leaveRequestService.deleteLeaveRequest(id);
	}

	@PutMapping("leaverequest/{id}")
	public void updateLeaveRequest(@PathVariable Integer id, @RequestBody LeaveRequest leaveRequest) {
		leaveRequestService.updateLeaveRequest(id, leaveRequest);
	}
}
