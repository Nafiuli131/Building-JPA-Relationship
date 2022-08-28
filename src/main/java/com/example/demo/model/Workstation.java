package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "workstation")
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String workstation_name;
    @OneToOne(mappedBy = "workstation")
    private Employee employee;

}
