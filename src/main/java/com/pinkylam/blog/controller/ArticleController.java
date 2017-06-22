package com.pinkylam.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月10日 下午9:08:08
 */

@Controller
@RequestMapping(value = "article")
public class ArticleController {

	@RequestMapping("/index")
	public String index() {
		return "backend/article_list";
	}
}
