package com.demo.gql.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.demo.gql.demo.dto.Blog;
import com.demo.gql.demo.repository.BlogRepository;

@Controller
public class BlogController {
	
	@Autowired
	private BlogRepository blogRepo;
	
	@SchemaMapping(typeName="Query", value="allBlogs")
	public List<Blog> getAllBlogs(){
		return blogRepo.allBlogs();
	}
	
	@QueryMapping
	public Blog blogById(@Argument Integer id) {
		return blogRepo.blogById(id);
	}
	
	@MutationMapping
	public Blog updateBlog (@Argument Integer id,@Argument String title) {
		return blogRepo.updateTitle(id, title);
	}
	
}

