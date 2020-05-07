package com.codeclan.lab.EmployeeTracker.models;


import javax.persistence.*;

@Entity
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name= "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "employee_num")
    private String employeeNum;

    @Column(name = "email")
    private String email;


    public Employee(String name, int age, String employeeNum, String email) {
        this.name = name;
        this.age = age;
        this.employeeNum = employeeNum;
        this.email = email;
    }

    public Employee() {

    }


//    getters


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public String getEmail() {
        return email;
    }

//    setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
