package com.pinkylam.blog.controller;

import com.pinkylam.blog.dao.UserDao;
import com.pinkylam.blog.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/getUser")
	public String deleteUser() {
		User user = userDao.getOne(1L);
		return user.getName();
	}
}
