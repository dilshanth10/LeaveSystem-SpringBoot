package com.sgic.ls.service.leavestatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sgic.ls.entity.LeaveStatus;

public interface LeaveStatusRepository extends JpaRepository<LeaveStatus, Integer>, QuerydslPredicateExecutor<LeaveStatus>{

}
