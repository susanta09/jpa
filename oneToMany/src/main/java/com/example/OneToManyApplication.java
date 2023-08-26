package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.EmpServices;
import com.example.service.EmpServicesImpl;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=
			SpringApplication.run(OneToManyApplication.class, args);
	EmpServices es=context.getBean(EmpServicesImpl.class);
//	es.saveEmpData();
	es.showData();
	}

	}
