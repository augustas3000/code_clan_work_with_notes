package com.codeclan.lab.EmployeeTracker.controllers;

import com.codeclan.lab.EmployeeTracker.models.Employee;
import com.codeclan.lab.EmployeeTracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


//    all employes
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<Employee> getEmployye(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

}
