package com.example.codeclan.EmployeesLab.repositories;

import com.example.codeclan.EmployeesLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
