package com.example.codeclan.EmployeesLab;

import com.example.codeclan.EmployeesLab.models.Department;
import com.example.codeclan.EmployeesLab.models.Employee;
import com.example.codeclan.EmployeesLab.models.Project;
import com.example.codeclan.EmployeesLab.repositories.DepartmentRepository;
import com.example.codeclan.EmployeesLab.repositories.EmployeeRepository;
import com.example.codeclan.EmployeesLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;



	@Test
	void contextLoads() {
	}


	@Test
	public void createAndAdd() {
		Department department;
		Employee ana;
		Employee dom;
		Project project;

		department = new Department("Sales");
		departmentRepository.save(department);


		ana = new Employee("Ana","Last",223,department);
		employeeRepository.save(ana);

		dom = new Employee("Dom","Tru", 222,department);
		employeeRepository.save(dom);

		project = new Project("Some project", 20);
		projectRepository.save(project);

		project.addEmployee(ana);
		project.addEmployee(dom);
		projectRepository.save(project);


		Project project2;
		project2 = new Project("Project 2", 30);
		projectRepository.save(project2);

		ana.addProject(project2);
		employeeRepository.save(ana);

	}

}
