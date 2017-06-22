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
 * @date 2017年6月20日 上午11:11:54
 */

@Entity
@Table(name = "ARTICLE")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AID")
	private Long aid;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "SLUG")
	private String slug;
	@Column(name = "COONTENT")
	private String coontent;
	@Column(name = "AUTHOR_ID")
	private Long authorId;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "TAGS")
	private String tags;
	@Column(name = "CATEGORIES")
	private String categories;
	@Column(name = "HITS")
	private String hits;
	@Column(name = "COMMENTS_NUM")
	private Integer commentsNum;
	@Column(name = "ALLOW_COMMENT")
	private Integer allowComment;
	@Column(name = "ALLOW_PING")
	private Integer allowPing;
	@Column(name = "ALLOW_FEED")
	private Integer allowFeed;
	@Column(name = "CREATE_TIME")
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date createTime;
	@Column(name = "UPDATE_TIME")
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date updateTime;

	public Long getAid() {
		return aid;
	}

	public Integer getAllowComment() {
		return allowComment;
	}

	public Integer getAllowFeed() {
		return allowFeed;
	}

	public Integer getAllowPing() {
		return allowPing;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public String getCategories() {
		return categories;
	}

	public Integer getCommentsNum() {
		return commentsNum;
	}

	public String getCoontent() {
		return coontent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getHits() {
		return hits;
	}

	public String getSlug() {
		return slug;
	}

	public String getStatus() {
		return status;
	}

	public String getTags() {
		return tags;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public void setAllowComment(Integer allowComment) {
		this.allowComment = allowComment;
	}

	public void setAllowFeed(Integer allowFeed) {
		this.allowFeed = allowFeed;
	}

	public void setAllowPing(Integer allowPing) {
		this.allowPing = allowPing;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public void setCommentsNum(Integer commentsNum) {
		this.commentsNum = commentsNum;
	}

	public void setCoontent(String coontent) {
		this.coontent = coontent;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Article [aid=" + aid + ", title=" + title + ", slug=" + slug + ", coontent=" + coontent + ", authorId="
				+ authorId + ", type=" + type + ", status=" + status + ", tags=" + tags + ", categories=" + categories
				+ ", hits=" + hits + ", commentsNum=" + commentsNum + ", allowComment=" + allowComment + ", allowPing="
				+ allowPing + ", allowFeed=" + allowFeed + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}

}
