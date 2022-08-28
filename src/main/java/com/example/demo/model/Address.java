package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    @OneToOne(mappedBy = "address")
    private User user;
}
