package com.sgic.ls.service.leaveday;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sgic.ls.entity.LeaveDay;
import com.sgic.ls.entity.LeaveDayId;

public interface LeaveDayRepository extends JpaRepository<LeaveDay, LeaveDayId>, QuerydslPredicateExecutor<LeaveDay>{

}
