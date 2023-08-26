package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmpRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmpRepository empRepository;

	@Override
	public void saveEmpData(List<Employee> el) {
		empRepository.saveAll(el);
		System.out.println("successfully inserted");
	}

	@Override
	public void customQuery() {
		//empRepository.findByeAge(23).forEach(System.out::println);
		//empRepository.findByEmpAgeAndEmpDept(23, "java").forEach(System.out::println);
		//empRepository.findByEmpSalGreaterThan(12000.00).forEach(System.out::println);
		empRepository.findByEmpSalGreaterThanAndEmpDept(12000.00, "java").forEach(System.out::println);
	}

}
