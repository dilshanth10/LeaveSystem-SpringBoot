package com.sgic.ls.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.ls.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public void updateUser(Integer id, User user) {
		User existUser = userRepository.getOne(id);
		existUser.setEmail(user.getEmail());
		existUser.setUsername(user.getUsername());
		existUser.setPassword(user.getPassword());
		existUser.setFirstName(user.getFirstName());
		existUser.setLastName(user.getLastName());
		existUser.setRole(user.getRole());
		userRepository.save(existUser);
	}

}
