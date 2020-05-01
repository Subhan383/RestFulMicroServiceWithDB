package org.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springboot.entity.Post;
import org.springboot.repository.PostRepository;

@Service
public class PostsService {

	@Autowired
	PostRepository repo;

	List<Post> posts = new ArrayList<Post>();

	public List<Post> getPosts() {
		List<Post> posts = new ArrayList<Post>();
		for (Post post : repo.findAll()) {
			posts.add(post);
		}
		return posts;
	}

	public Post getPost(int postId) {
		return repo.findById(postId).get();
	}

	public void addingPost(Post listOfPost) {
		repo.save(listOfPost);
	}

	public void updatePost(Post listOfPost) {
		repo.save(listOfPost);

	}

	public void deletePost(int postId) {
		repo.deleteById(postId);
	}

}
