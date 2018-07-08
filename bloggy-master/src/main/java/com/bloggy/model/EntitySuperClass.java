package com.bloggy.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntitySuperClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
