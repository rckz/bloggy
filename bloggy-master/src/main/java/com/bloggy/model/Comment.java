package com.bloggy.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment extends EntitySuperClass{
    private String userName;

    private String comment;
}
