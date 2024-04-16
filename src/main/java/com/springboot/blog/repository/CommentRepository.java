package com.springboot.blog.repository;

import com.springboot.blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    // Custom repository method for finding all comments by a particular postId..
    List<Comment> findByPostId(long postId);
}
