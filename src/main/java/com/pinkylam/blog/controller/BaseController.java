package com.pinkylam.blog.controller;

import com.pinkylam.blog.entity.User;

import javax.servlet.http.HttpServletRequest;


public abstract class BaseController {

    public static String THEME = "themes/default";

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }

    /**
     * 主页的页面主题
     * @param viewName
     * @return
     */
    public String render(String viewName) {
        return THEME + "/" + viewName;
    }

    public String render_404() {
        return "comm/error_404";
    }

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    /**
     * 获取请求绑定的登录对象
     * @param request
     * @return
     */
	public User user(HttpServletRequest request) {
		User user = (User) request.getAttribute("user");
		return user;
    }

}
