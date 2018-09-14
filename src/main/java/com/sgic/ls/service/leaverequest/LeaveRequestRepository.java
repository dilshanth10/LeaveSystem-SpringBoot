package com.sgic.ls.service.leaverequest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.ls.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer>{

}
