package com.example.codeclan.EmployeesLab.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "department_name")
    private String deptName;

    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public Department() {

    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }


//    getters


    public Long getId() {
        return id;
    }

    public String getDeptName() {
        return deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

//    setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
