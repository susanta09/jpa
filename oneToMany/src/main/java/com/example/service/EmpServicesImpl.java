package com.example.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.repository.AddressRepository;
import com.example.repository.EmployeeRepository;
@Service
public class EmpServicesImpl implements EmpServices {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void saveEmpData() {
		Address a1=new Address(1, "bng","kar", "temp");
		Address a2=new Address(2, "kal","bangal", "per");
		List<Address> la=Arrays.asList(a1,a2);
		Employee e=new Employee(1, "susanta", 680000.0, la);
//		addressRepository.saveAll(la);
		employeeRepository.save(e);
		System.out.println("successfull");
	}

	@Override
	public void showData() {
//		Optional<Employee> e=employeeRepository.findById(1);
//		Employee emp=e.get();
//		//System.out.println(e.get());
//	   System.out.println("Employee id: "+emp.getEmpId());
//	   System.out.println("Employee name: "+emp.getEmpName());
//	   System.out.println("Employee sal: "+emp.getEmpSal());
//	   System.out.println("Employee address");
//	   emp.getAddresses().forEach(t->{
//		   System.out.println(" id "+t.getId());
//		   System.out.println("city "+t.getCity());
//		   System.out.println("state "+t.getState());
//		   System.out.println("type "+t.getType());
//	   });
		//get the adddress record
//		Optional<Address> add=addressRepository.findById(1);
//		System.out.println(add.get());
		//update address
//		Optional<Address> add=addressRepository.findById(1);
//		Address a=add.get();
//		a.setCity("Mombi");
//		addressRepository.save(a);
		//delete address
//		addressRepository.deleteById(1)
		//delete employee 
//		employeeRepository.deleteById(1);
		
		
//		addressRepository.deleteAddressBYAddressType("temp");
		addressRepository.deleteAddressBYAddressType(1,"per");
		
		
//		Employee e=employeeRepository.findById(1).get();
//		List<Address> la=e.getAddresses();
//		System.out.println(la);
//		List<Address> nla=la.stream().filter(a->a.getType().equals("temp"))
//				.collect(Collectors.toList());
//		System.out.println("yy"+nla);
//		addressRepository.deleteAll(nla);
	}

	
	
}
