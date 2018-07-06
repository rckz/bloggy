package com.bloggy.service;

import com.bloggy.dao.CommentRepository;
import com.bloggy.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment){
        return commentRepository.save(comment);
    }

    public Comment updateComment(Comment comment){
        return commentRepository.save(comment);
    }

    public Comment deleteComment (Comment comment){
        commentRepository.delete(comment);
        return comment;
    }

    public List<Comment> listComment(){
        return commentRepository.findAll();
    }
}
