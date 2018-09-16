package com.sgic.ls.service.leaverequest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sgic.ls.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer>, QuerydslPredicateExecutor<LeaveRequest>{

	@Query("SELECT lr FROM LeaveRequest AS lr WHERE lr.user.firstName=?1 and lr.leave.allocationPeriod=?2")
	List<LeaveRequest> findByUserNameAndAllocation(String firstName, float allocationPeriod);
}
