package com.sgic.ls.service.role;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.Role;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Iterable<Role> getAllRoles() {
		Iterable<Role> roleList;
		roleList = roleRepository.findAll();
		return roleList;
	}
	
	@Override
	public void addRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);
	}
	
	@Override
	public void updateRole(Integer id, Role role) {
		
		Optional<Role> roleOption = roleRepository.findById(id);
		Role roleObj = null;
		if(roleOption.isPresent()) {
		    roleObj = roleOption.get();
		    roleObj.setRoleName(role.getRoleName());
		    roleRepository.save(roleObj);
		}
	}
}
