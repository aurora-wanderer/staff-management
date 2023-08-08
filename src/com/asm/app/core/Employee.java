/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 *
 * @author MSI GL62
 */
public class Employee {

    private static final Logger LOG = Logger.getLogger(Employee.class.getName());

    private String ID;
    private String name;
    private int age;
    private String email;
    private double luong;

    public Employee() {
    }

    public Employee(String ID, String name, int age, String email, double luong) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.luong = luong;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getLuong() {
        return luong;
    }

    public static Logger getLOG() {
        return LOG;
    }

    @Override
    public String toString() {
        return "\nEmployee \n\t"
                + "ID = " + "[" + this.ID + "]"
                + ", name = " + this.name
                + ", age = " + this.age
                + ", email = " + this.email
                + ", Luong = " + this.luong;
    }

    public static Predicate<Employee> predicateID(String value) {
        return x -> x.getID().equalsIgnoreCase(value);
    }
}
