package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String emp_name;
    @OneToOne
    @JoinTable(name = "emplolyee_workstation",
            joinColumns =
                    { @JoinColumn(name = "emp_id",referencedColumnName = "id")},
            inverseJoinColumns =
                    {
                            @JoinColumn(name = "workstation_id",referencedColumnName = "id")
                    }
    )
    private Workstation workstation;

}
