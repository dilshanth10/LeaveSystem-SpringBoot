package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.LeaveDay;
import com.sgic.ls.entity.LeaveDayId;
import com.sgic.ls.service.leaveday.LeaveDayService;

@RestController
public class LeaveDayController {

	@Autowired
	public LeaveDayService leaveDayService;
	
	@GetMapping("/leaveday")
	public Iterable<LeaveDay> getAllLeaveDays() {
		return leaveDayService.getAllLeaveDays();
	}
	
	@PostMapping("/leaveday")
	public void addLeaveDay(@RequestBody LeaveDay leaveDay) {
		leaveDayService.addLeaveDay(leaveDay);
	}
	
	@DeleteMapping("/leaveday")
	public void deleteLeaveDay(@RequestBody LeaveDayId leaveDayId) {
		leaveDayService.deleteLeaveDay(leaveDayId);
	}
	
	@PutMapping("/leaveday")
	public void updateLeaveDay(@RequestBody LeaveDay leaveDay) {
		leaveDayService.updateLeaveDay(leaveDay);
	}
}
