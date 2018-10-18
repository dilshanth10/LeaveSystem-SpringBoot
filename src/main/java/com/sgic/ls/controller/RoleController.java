package com.sgic.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.ls.entity.Role;
import com.sgic.ls.service.role.RoleService;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
public class RoleController {

//	@GetMapping("/")
//	public String welcome() {
//		return "Hi Welcome";
//	}
//	
	
	@Autowired
	public RoleService roleService;
	
	@GetMapping("/role")
	public Iterable<Role> getAllRoles() {
		return roleService.getAllRoles();
	}
	
	@PostMapping("/role")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
	
	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable Integer id) {
		roleService.deleteRole(id);
	}
	
	@PutMapping("/role/{id}")
	public void updateRole(@PathVariable Integer id, @RequestBody Role role) {
		roleService.updateRole(id, role);
	}
	
//	@Query("SELECT * FROM role WHERE roleId")
}
