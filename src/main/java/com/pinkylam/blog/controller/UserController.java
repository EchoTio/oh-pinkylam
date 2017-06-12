package com.pinkylam.blog.controller;

import com.pinkylam.blog.dao.UserDao;
import com.pinkylam.blog.entity.User;
import com.pinkylam.blog.model.ErrorCode;
import com.pinkylam.blog.model.ExecuteResult;
import com.pinkylam.blog.util.WebConst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
			session.setAttribute(WebConst.LOGIN_SESSION_KEY, user);
			result.setSuccess(true);
			result.setData(user);
		} else {
			result.setSuccess(false);
			result.setErrorCode(ErrorCode.USERNAME_OR_PWD_ERROR.name());
			result.setErrorMsg(ErrorCode.USERNAME_OR_PWD_ERROR.getErrorMsg());
		}
		return result;
	}

	@RequestMapping("logout")
	public void logout(HttpSession session, HttpServletResponse response) {
		session.removeAttribute(WebConst.LOGIN_SESSION_KEY);
		Cookie cookie = new Cookie(WebConst.USER_IN_COOKIE, "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		try {
			response.sendRedirect("login");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}
