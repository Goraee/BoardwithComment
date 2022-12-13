package com.sparta.board.repository;

import com.sparta.board.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

//public interface CommentRepository extends JpaRepository<Comment, Long> {
    //List<Comment> findAllByOrderByModifiedAtDesc();


//    Optional<Comment> findByIdAndUserId(Long id, Long userId);


