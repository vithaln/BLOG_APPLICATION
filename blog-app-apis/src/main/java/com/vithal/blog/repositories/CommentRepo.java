package com.vithal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vithal.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
