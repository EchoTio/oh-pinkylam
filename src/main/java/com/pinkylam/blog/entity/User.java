package com.pinkylam.blog.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pinkylam.blog.util.CustomDateSerializer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月9日 上午10:29:51
 */

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NICK")
	private String nick;
	@Column(name = "PWD")
	private String pwd;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "CREATE_TIME")
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date createTime;
	@Column(name = "UPDATE_TIME")
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date updateTime;

	public Date getCreateTime() {
		return createTime;
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNick() {
		return nick;
	}

	public String getPwd() {
		return pwd;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
