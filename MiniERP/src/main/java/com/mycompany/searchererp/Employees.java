
package com.mycompany.searchererp;

import java.math.BigInteger;


public class Employees {
    private int id;
    private String name;
    private String surName;
    private String position;
    private String phone;
    private double salary;

    public Employees(int id, String name, String surName, String position, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }
    
    
    
    
    
}