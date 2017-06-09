package com.pinkylam.blog.controller;

import com.pinkylam.blog.dao.UserDao;
import com.pinkylam.blog.entity.User;
import com.pinkylam.blog.model.ErrorCode;
import com.pinkylam.blog.model.ExecuteResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping("/index")
	public String index() {
		return "backend/index";
	}

	@RequestMapping("/login")
	public String login() {
		return "backend/login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ResponseBody
	public ExecuteResult<User> login(HttpSession session, final String name, final String pwd) {
		ExecuteResult<User> result = new ExecuteResult<User>();
		User user = userDao.findByNameAndPwd(name, pwd);
		if (user != null) {
			session.setAttribute("user", user);
			result.setSuccess(true);
			result.setData(user);
		} else {
			result.setSuccess(false);
			result.setErrorCode(ErrorCode.USERNAME_OR_PWD_ERROR.name());
			result.setErrorMsg(ErrorCode.USERNAME_OR_PWD_ERROR.getErrorMsg());
		}
		return result;
	}

}
