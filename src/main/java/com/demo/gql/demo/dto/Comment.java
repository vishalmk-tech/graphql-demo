package com.demo.gql.demo.dto;

import java.util.List;

public class Comment {
	
	Integer id;
	
	String comment;
	
	User user;
	
	List<Comment> reply;

	public Comment(Integer id, String comment, User user) {
		super();
		this.id = id;
		this.comment = comment;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getReply() {
		return reply;
	}

	public void setReply(List<Comment> reply) {
		this.reply = reply;
	}
	
	

}
