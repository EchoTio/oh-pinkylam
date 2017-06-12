package com.pinkylam.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月10日 下午9:08:08
 */

@Controller
@RequestMapping(value = "article")
public class ArticleController extends BaseController {

	@RequestMapping("/index")
	public String index(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "15") int limit, HttpServletRequest request) {
		// ContentVoExample contentVoExample = new ContentVoExample();
		// contentVoExample.setOrderByClause("created desc");
		// contentVoExample.createCriteria().andTypeEqualTo(Types.ARTICLE.getType());
		// PageInfo<ContentVo> contentsPaginator =
		// contentsService.getArticlesWithpage(contentVoExample, page, limit);
		// request.setAttribute("articles", contentsPaginator);
		return "backend/article_list";
	}
}
