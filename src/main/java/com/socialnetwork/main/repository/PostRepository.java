package com.socialnetwork.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialnetwork.main.model.Post;
//import com.socialnetwork.main.testcases.Posts;


public interface PostRepository extends JpaRepository<Post, Long> {

	//public void save(Post any);
}




