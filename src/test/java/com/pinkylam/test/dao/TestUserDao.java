package com.pinkylam.test.dao;

import com.pinkylam.blog.Main;
import com.pinkylam.blog.dao.UserDao;
import com.pinkylam.blog.entity.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月9日 上午10:48:23
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class TestUserDao {

	@Autowired
	UserDao userDao;

	@Test
	public void testFindUser() {
		User user = userDao.findOne(1L);
		System.out.println(user.getName());
		Assert.assertEquals("handx", user.getName());
	}
}
