package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Employee;
import com.jpa.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	//get All employees
	public List<Employee> getAllEmployees(){	
		System.out.println(empRepo.findAll());
		return empRepo.findAll();
	}
	
	//Save Employee
	public Employee saveEmployee(Employee emp){
		return empRepo.save(emp);
	}
}
 