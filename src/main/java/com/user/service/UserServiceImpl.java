package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	List<User> list = List.of(
			new User(1311L,"Avinash Singh", "1234567890"),
			new User(1312L,"Avi Singh", "9874563210"),
			new User(1314L,"Avina Singh", "9876543210")
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null); 
	}

}
