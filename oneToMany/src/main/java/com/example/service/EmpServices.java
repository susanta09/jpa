package com.example.service;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface EmpServices {
	public void saveEmpData();
	public void showData();


}
