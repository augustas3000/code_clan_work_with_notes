package com.codeclan.lab.EmployeeTracker;

import com.codeclan.lab.EmployeeTracker.models.Employee;
import com.codeclan.lab.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void createEmployee() {
		Employee emily;
		emily = new Employee("Emily",22,"A347628B","emily@emily.com");
		employeeRepository.save(emily);
		employeeRepository.save(emily);
		employeeRepository.save(emily);

	}




}
