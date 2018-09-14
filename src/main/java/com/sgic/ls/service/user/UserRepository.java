package com.sgic.ls.service.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.ls.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
