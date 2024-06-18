package com.example.employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/employees")
	public List<Employee> readEmployees() {
		return empService.getEmployees();
	}

}
