package org.springboot.controller;

import java.util.List;

import org.springboot.entity.Post;
import org.springboot.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
	@Autowired
	PostsService service;
	
	@GetMapping("posts")
	public List<Post> getPosts(){
		return service.getPosts();
	}
	
	@GetMapping("/posts/{postId}")
	public Post getPost(@PathVariable int postId) {
		return service.getPost(postId);
		
	}
	
	@PostMapping("/posts")
	public void addingPost(@RequestBody Post listOfPost) {
		service.addingPost(listOfPost);
	}
	
	@PutMapping("/posts/{postId}")
	public void updatePost(@RequestBody Post listOfPost) {
		service.updatePost(listOfPost);
	}
	
	@DeleteMapping("/posts/{postId}")
	public void deletePost(@PathVariable int postId) {
		service.deletePost(postId);
		
	}
	

}
