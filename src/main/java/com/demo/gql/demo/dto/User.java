package com.demo.gql.demo.dto;

import java.util.List;
import java.util.Set;

public class User {
	
	String username;
	Integer userid;
	
	Set<User> followers;
	
	public User(String username, Integer userid) {
		super();
		this.username = username;
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Set<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<User> followers) {
		this.followers = followers;
	}
	
	
	

}
