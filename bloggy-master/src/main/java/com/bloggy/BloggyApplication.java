package com.bloggy;

import com.bloggy.dao.BlogPostRepository;
import com.bloggy.dao.CommentRepository;
import com.bloggy.model.Comment;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BloggyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggyApplication.class, args);
	}
}
