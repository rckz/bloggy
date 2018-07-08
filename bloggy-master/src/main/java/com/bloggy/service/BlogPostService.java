package com.bloggy.service;

import com.bloggy.dao.BlogPostRepository;
import com.bloggy.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;

    public BlogPost createBlogPost(BlogPost blogPost){
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(BlogPost blogPost){
        return blogPostRepository.save(blogPost);
    }

    public BlogPost deleteBlogPost(BlogPost blogPost){
        blogPostRepository.delete(blogPost);
        return blogPost;
    }

    public List<BlogPost> listBlogPost (){
        return blogPostRepository.findAll();
    }
}
