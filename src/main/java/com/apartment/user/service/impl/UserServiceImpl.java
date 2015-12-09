package com.apartment.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.mybatis.entity.User;
import com.apartment.user.dao.UserDao;
import com.apartment.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao; 
	
	public User loginUser(User user) {
		 System.out.println(user.getUsername());
		 System.out.println(user.getPassword());
		 return userDao.loginUser(user);
	}

}
