package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;
@Service
public interface EmployeeService {
	public void saveEmpData(List<Employee> el);
	public void customQuery();

}
