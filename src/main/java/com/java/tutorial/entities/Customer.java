package com.java.tutorial.entities;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @ManyToOne
    private Department department;

    public Customer() {}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Integer getId() {
        return id;
    }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}
