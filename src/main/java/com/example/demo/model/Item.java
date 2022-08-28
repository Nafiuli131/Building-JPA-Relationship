package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String item_name;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart; //owing side
}
