package com.example.codeclan.EmployeesLab.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "project_name")
    private String projectName;


    @Column(name = "duration")
    private int duration;


    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(name = "project_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "employee_id", nullable = false, updatable = false)}
    )
    private List<Employee> employeesInCharge;


    public Project(String projectName, int duration) {
        this.projectName = projectName;
        this.duration = duration;
        this.employeesInCharge = new ArrayList<>();
    }

    public Project() {

    }

    public void addEmployee(Employee employee) {
        this.employeesInCharge.add(employee);
    }




//    getters


    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getDuration() {
        return duration;
    }

    public List<Employee> getEmployeesInCharge() {
        return employeesInCharge;
    }

//    setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setEmployeesInCharge(List<Employee> employeesInCharge) {
        this.employeesInCharge = employeesInCharge;
    }
}
