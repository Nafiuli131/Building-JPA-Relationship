package com.example.demo.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String cartName;
    @OneToMany(mappedBy = "cart")
    private Set<Item> items; //inverse side
}
