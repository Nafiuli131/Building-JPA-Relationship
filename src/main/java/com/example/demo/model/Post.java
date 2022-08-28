package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String post_name;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "post_tag_table",
            joinColumns = {@JoinColumn(name = "post_id",referencedColumnName = "id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "tag_id",referencedColumnName = "id")}
    )
    private Set<Tag> tags= new HashSet<>();
}
