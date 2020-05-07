package com.example.codeclan.EmployeesLab.repositories;

import com.example.codeclan.EmployeesLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
