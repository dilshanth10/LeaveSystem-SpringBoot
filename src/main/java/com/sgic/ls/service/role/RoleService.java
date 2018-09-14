package com.sgic.ls.service.role;

import com.sgic.ls.entity.Role;

public interface RoleService {

	public Iterable<Role> getAllRoles();
	
	public void addRole(Role role);
	
	public void deleteRole(Integer id);
	
	public void updateRole(Integer id, Role role);
}
