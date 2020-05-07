package com.example.codeclan.EmployeesLab.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "employee_number")
    private int employeeNumber;

//    if we keep as jsonignore, if we try to create aa new instance from front end
//    so jsonignoreproperties should be used over jsonignore
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false) //cant have department as null
    private Department department;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(name = "employee_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "project_id", nullable = false, updatable = false)}
    )
    private List<Project> projects;


//    department not null - sql error

    public Employee(String firstName, String lastName, int employeeNumber, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.projects = new ArrayList<>();
    }

    public Employee() {

    }


    public void addProject(Project project) {
        this.projects.add(project);
    }


//    getters
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Project> getProjects() {
        return projects;
    }




//    setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
