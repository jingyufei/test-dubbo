package com.jing.serviceImpl;

import org.springframework.stereotype.Service;

import com.jing.entity.User;
import com.jing.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public User getUser() {
		User user = new User("小明", 20);
		return user;
	}

	@Override
	public String saveUser(User user) {
		System.out.println(user.toString());
		return user.toString();
	}

}
