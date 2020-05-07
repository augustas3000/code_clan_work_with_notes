package com.codeclan.lab.EmployeeTracker.repositories;

import com.codeclan.lab.EmployeeTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
