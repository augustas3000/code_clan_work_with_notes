package com.example.codeclan.EmployeesLab.repositories;

import com.example.codeclan.EmployeesLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
