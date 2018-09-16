package com.sgic.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

	@GetMapping("/leaverequests/")
	public Iterable<LeaveRequest> getAllLeaveRequests() {
		return leaveRequestService.getAllLeaveRequests();
	}

	@PostMapping("/leaverequests")
	public void addLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
		leaveRequestService.addLeaveRequest(leaveRequest);;
	}

	@DeleteMapping("/leaverequests/{id}")
	public void deleteLeaveRequest(@PathVariable Integer id) {
		leaveRequestService.deleteLeaveRequest(id);
	}

	@PutMapping("leaverequests/{id}")
	public void updateLeaveRequest(@PathVariable Integer id, @RequestBody LeaveRequest leaveRequest) {
		leaveRequestService.updateLeaveRequest(id, leaveRequest);
	}
	
	@GetMapping("leaverequests")
	public List<LeaveRequest> findByUserNameAndAllocation(@Param("firstname") String firstName, @Param("allocationPeriod") float allocationPeriod) {
		return leaveRequestService.findByUserNameAndAllocation(firstName, allocationPeriod);
	}
}
