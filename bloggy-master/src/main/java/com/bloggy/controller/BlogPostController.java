package com.bloggy.controller;

import com.bloggy.model.BlogPost;
import com.bloggy.model.Comment;
import com.bloggy.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @RequestMapping(method = RequestMethod.POST,path = "/create")
    public BlogPost create(@RequestBody BlogPost blogPost) {
        return blogPostService.createBlogPost(blogPost);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/read")
    public List<BlogPost> read(){
        return blogPostService.listBlogPost();
    }

    @RequestMapping(method = RequestMethod.POST,path = "/update")
    public BlogPost update(@RequestBody BlogPost blogPost){
        return blogPostService.updateBlogPost(blogPost);
    }

    @RequestMapping(method = RequestMethod.POST,path = "/delete")
    public BlogPost delete(@RequestBody BlogPost blogPost){
        blogPostService.deleteBlogPost(blogPost);
        return blogPost;
    }
}
