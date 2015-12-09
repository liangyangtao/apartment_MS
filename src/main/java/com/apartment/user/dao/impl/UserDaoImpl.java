package com.apartment.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.apartment.mybatis.entity.User;
import com.apartment.user.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	public User loginUser(User user) {

		if (user.getUsername().equals("admin")
				&& user.getPassword().equals("admin")) {
			user.setPermission("ADMIN");
			return user;
		}

		return user;
	}

}
