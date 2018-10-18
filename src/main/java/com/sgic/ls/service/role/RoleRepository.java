package com.sgic.ls.service.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.sgic.ls.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>, QuerydslPredicateExecutor<Role>{
	
}
