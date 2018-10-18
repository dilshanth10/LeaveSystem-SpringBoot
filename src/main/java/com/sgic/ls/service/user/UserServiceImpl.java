package com.sgic.ls.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.sgic.ls.criteria.UserCriteria;
import com.sgic.ls.entity.QUser;
import com.sgic.ls.entity.User;

import ch.qos.logback.core.joran.conditional.IfAction;

@Service
public class UserServiceImpl implements UserService {
  
//  @Value("${propertyname}")
//  private String googleTOken;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public boolean updateUser(Integer id, User user) {
		User existUser = userRepository.getOne(id);
		if (existUser.getId() == user.getId()) {
			existUser.setEmail(user.getEmail());
			existUser.setUsername(user.getUsername());
			existUser.setPassword(user.getPassword());
			existUser.setFirstName(user.getFirstName());
			existUser.setLastName(user.getLastName());
			existUser.setRole(user.getRole());
			userRepository.save(existUser);
		}
		return true;
	}

	@Override
	public User findByFirstName(String name) {
		return userRepository.findByFirstName(name);
	}

//	@Override
//	public List<User> Search(UserCriteria userCriteria) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public List<User> search(UserCriteria userCriteria) {
		List<User> users = new ArrayList<>();
		
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		
		if(userCriteria.getLeaveAllocation() != 0) {
			booleanBuilder.and(QUser.user.leaveRequest.any().leave.allocationPeriod.eq(userCriteria.getLeaveAllocation()));
		}
		if(userCriteria.getLeaveType() !=null) {
			booleanBuilder.and(QUser.user.leaveRequest.any().leave.leaveType.containsIgnoreCase(userCriteria.getLeaveType()));
		}
//		if(userCriteria.getTelephone() != null) {
//			booleanBuilder.and(QUser.user.telephone.containsIgnoreCase(userCriteria.getTelephone()));
//		}
		
		if(userCriteria.getFirstName() != null) {
			booleanBuilder.and(QUser.user.firstName.containsIgnoreCase(userCriteria.getFirstName()));
		}
		
		if(booleanBuilder.hasValue()) {
			userRepository.findAll(booleanBuilder).forEach(users::add);
		}else {
			users = userRepository.findAll();
		}
		
		return users;
	}

}
