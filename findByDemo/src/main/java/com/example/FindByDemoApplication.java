package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

@SpringBootApplication
public class FindByDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				SpringApplication.run(FindByDemoApplication.class, args);
		EmployeeService es=context.getBean(EmployeeServiceImpl.class);
//		es.saveEmpData(
//				Arrays.asList(
//						new Employee(1, "rama", "rama@12gmail.com", 23, "java", 12000.00),
//						new Employee(2, "barun", "brun@12gmail.com", 27, "java", 12000.00),
//						new Employee(4, "mona", "mona@12gmail.com", 25, "java", 16000.00),
//						new Employee(3, "barman", "barman@12gmail.com", 27, "spring", 18000.00),
//						new Employee(6, "suman", "suman@12gmail.com", 23, "sql", 10000.00)
//						)
//				);
		es.customQuery();
		System.out.println("Successfully run");
	}

}
