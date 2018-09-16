package com.sgic.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.criteria.UserCriteria;
import com.sgic.ls.entity.User;
import com.sgic.ls.service.user.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService;
	
	@GetMapping("/users/")
	public Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

	@PutMapping("/users/{id}")
	public void updateUser(@PathVariable Integer id, @RequestBody User user) {
		userService.updateUser(id, user);
	}
	
//	@GetMapping("/user/{firstName}")
//	public User getUserByFirstName(@PathVariable String firstName) {
//		return userService.findByFirstName(firstName);
//	}
	
	@GetMapping("/users") // (@RequestParam(value="firstname", required=false) String firstName)
	public User getUserByFirstName(@Param("firstname") String firstName) {
		return userService.findByFirstName(firstName);
	}
	
	@GetMapping("/users/search")
	public List<User> getUsers(UserCriteria userCriteria){
		return userService.search(userCriteria);
		
	}
}
