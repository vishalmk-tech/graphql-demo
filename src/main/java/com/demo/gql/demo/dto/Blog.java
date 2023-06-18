package com.demo.gql.demo.dto;

import java.util.List;
import java.util.Set;

public class Blog {
	
	Integer id;
	String title;
	String content;
	
	User author;
	Set<User> likes;
	List<Comment> comments;
		
	public Blog(Integer id, String title, String content, User author) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public Set<User> getLikes() {
		return likes;
	}
	public void setLikes(Set<User> likes) {
		this.likes = likes;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	

}
