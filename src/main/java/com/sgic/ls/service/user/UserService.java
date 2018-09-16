package com.sgic.ls.service.user;

import java.util.List;

import com.sgic.ls.criteria.UserCriteria;
import com.sgic.ls.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public boolean addUser(User user);

	public void deleteUser(Integer id);

	public boolean updateUser(Integer id, User user);
	
	public User findByFirstName(String name);
	
	public List<User> search(UserCriteria userCriteria);
}
