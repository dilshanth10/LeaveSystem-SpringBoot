package com.sgic.ls.service.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sgic.ls.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>, QuerydslPredicateExecutor<User> {
	User findByFirstName(String name);
}
