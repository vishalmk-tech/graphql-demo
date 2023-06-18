package com.demo.gql.demo.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.demo.gql.demo.dto.Blog;
import com.demo.gql.demo.dto.Comment;
import com.demo.gql.demo.dto.User;

@Component
public class BlogRepository {
	
	private static List<Blog> blogs = new ArrayList<>();
	
	static {
		User user1=new User("Vishal", 1);
		User user2=new User("Suhas", 2);
		User user3=new User("Akash", 3);
		User user4=new User("Dev", 4);
		User user5=new User("Shweta", 5);
		User user6=new User("Swati", 6);
		User user7=new User("Vishali", 7);
		User user8=new User("VT", 8);
		Blog blog1 = new Blog(1, "GraphQL: The Buzz is Real", "This is a blog about GraphQL", user1 );
		Blog blog2 = new Blog(2, "Payment Data Lake on Cloud", "Building Payment Data platform on cloud...",user1 );
		
		Set<User> like1= new HashSet<>();
		like1.add(user2);
		like1.add(user3);
		like1.add(user4);
		like1.add(user5);
		like1.add(user6);
		Set<User> like2= new HashSet<>();
		like2.add(user5);
		like2.add(user6);
		like2.add(user7);
		like2.add(user8);
		
		blog1.setLikes(like1);
		blog2.setLikes(like2);
		
		Comment cm1= new Comment(1, "I'm gonna switch to GraphQl now", user4);
		Comment cm2= new Comment(2, "Will there be an hands-on session?", user2);
		Comment reply1 = new Comment(1, "Yes, stay tuned..", user1);
		List<Comment> comm = new LinkedList<>();
		comm.add(cm1); comm.add(cm2);
		List<Comment> reply = new LinkedList<>();
		reply.add(reply1);
		cm2.setReply(reply);
		blog1.setComments(comm);
		
		user1.setFollowers(like1);
		user2.setFollowers(like2);
		
		blogs.add(blog1); blogs.add(blog2);
		
		
	}
	
	public List<Blog> allBlogs(){
		 return blogs;
	}
	
	public Blog blogById(Integer id) {
		for (Blog blog : blogs) {
			if (blog.getId() == id)
				return blog;
		}
		return null;
	}
	
	public Blog updateTitle(Integer id, String title) {
		Blog blog = blogById(id);
		if(null!=blog)blog.setTitle(title);
		return blog;
	}
}
