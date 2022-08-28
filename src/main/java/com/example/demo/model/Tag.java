package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String tag_name;
    @ManyToMany(mappedBy = "tags")
    private Set<Post> posts = new HashSet<>();
}
