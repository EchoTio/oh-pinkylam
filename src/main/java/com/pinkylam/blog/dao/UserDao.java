package com.pinkylam.blog.dao;

import com.pinkylam.blog.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月9日 上午10:26:23
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

	User findByNameAndPwd(String name, String pwd);

}
