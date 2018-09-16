package com.sgic.ls.service.leave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sgic.ls.entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer>, QuerydslPredicateExecutor<Leave>{

}
