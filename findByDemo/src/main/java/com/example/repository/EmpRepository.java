package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	//sql:-select * from employee where age:=?;
	//List<Employee> findByEAge(Integer eAge); it is not work because variable name is not match with property name of entity
	//List<Employee> findByeAge(Integer eAge);//it is work
	//sql:-select * from employee where age:=? and dept:=?;
	//List<Employee> findByEmpAgeAndEmpDept(Integer empAge,String empDept);
	//sql:-select * from employee where sal>?;
	//List<Employee> findByEmpSalGreaterThan(Double sal);
	List<Employee> findByEmpSalGreaterThanAndEmpDept(Double sal,String dept);

}
