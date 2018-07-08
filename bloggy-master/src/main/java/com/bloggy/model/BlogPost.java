package com.bloggy.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlogPost extends EntitySuperClass{

    private String userName;

    private String location;

    private String fileName;

    private String mark;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Comment> commentList;
}
