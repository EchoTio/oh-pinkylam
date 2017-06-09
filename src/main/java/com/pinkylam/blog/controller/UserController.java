package com.pinkylam.blog.controller;

import com.pinkylam.blog.dao.UserDao;
import com.pinkylam.blog.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/getUser")
	public String deleteUser() {
		User user = userDao.getOne(1L);
		return user.getName();
	}

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "handx");
		return "index";
	}
}
