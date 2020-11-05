package org.mma.training.java.spring;

import org.mma.training.java.spring.model.Department;
import org.mma.training.java.spring.model.Employee;
import org.mma.training.java.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaHibernateMysql1Application implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaHibernateMysql1Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Employee employee = new Employee(101, "Yousuf", "Akbar", "Tom");
		 * employeeRepository.save(employee);
		 */
		Department department = new Department("Engineering", "Ali Ahmed");
		Employee employee = new Employee("Mohammad", "Fatih", "Ali Ahmed", department);
		employeeRepository.save(employee);
		
	}

}
