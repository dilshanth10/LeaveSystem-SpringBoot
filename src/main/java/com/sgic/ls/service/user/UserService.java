package com.sgic.ls.service.user;

import com.sgic.ls.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public boolean addUser(User user);

	public void deleteUser(Integer id);

	public boolean updateUser(Integer id, User user);
}
