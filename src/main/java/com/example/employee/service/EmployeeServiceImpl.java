package com.example.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> topicList = new ArrayList<>(Arrays.asList(

			new Employee(6, "_spring", "_Spring FrameWork", "_Spring Description"),
			new Employee(7, "spring", "Spring FrameWork", "Spring Description"),
			new Employee(8, "java", "Java FrameWork", "Java Description")

	));

	@Override
	public List<Employee> getEmployees() {
		return topicList;
	}

}
