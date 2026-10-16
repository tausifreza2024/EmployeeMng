package com.cfs.employeManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employes")
public class Employe {

    // Primary key with auto-increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Employee name (max 30 characters, not null)
    @Column(nullable = false, length = 30)
    private String name;

    // Employee email (max 50 characters, not null)
    @Column(nullable = false, length = 50)
    private String email;

    // Employee department (database column name: departmetn)
    @Column(name = "departmetn", nullable = false, length = 50)
    private String departmetn;

    // Employee salary (not null)
    @Column(nullable = false)
    private Double salary;

    // Temporary field; this field will not be stored in the database
    @Transient
    private String temp;

    // Default constructor required by JPA
    public Employe() {
    }

    // Parameterized constructor
    public Employe(Integer id, String name, String email,
                   String departmetn, Double salary, String temp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmetn = departmetn;
        this.salary = salary;
        this.temp = temp;
    }

    // Getter and setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter for department
    public String getDepartmetn() {
        return departmetn;
    }

    public void setDepartmetn(String departmetn) {
        this.departmetn = departmetn;
    }

    // Getter and setter for salary
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Getter and setter for temporary field
    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}

