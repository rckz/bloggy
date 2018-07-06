package com.bloggy.controller;

import com.bloggy.model.Comment;
import com.bloggy.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(method = RequestMethod.POST,path = "/create")
    public Comment create(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/read")
    public List<Comment> read(){
        return commentService.listComment();
    }

    @RequestMapping(method = RequestMethod.POST,path = "/update")
    public Comment update(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @RequestMapping(method = RequestMethod.POST,path = "/delete")
    public Comment delete(@RequestBody Comment comment){
        commentService.deleteComment(comment);
        return comment;
    }
}
