package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.User;
import com.sgic.ls.service.user.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService;
	
	@GetMapping("/user")
	public Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable Integer id, @RequestBody User user) {
		userService.updateUser(id, user);
	}
}
