package com.example.employee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository empRepository;

	@Override
	public Employee createEmployee(Employee emp) {
		return empRepository.save(emp);
	}

	@Override
	public Employee getEmployeeById(Long empId, Employee empDetails) {
		return empRepository.findById(empId).get();
	}

	@Override
	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Long empId, Employee employeeDetails) {
		Employee emp = empRepository.findById(empId).get();
		emp.setFirstName(employeeDetails.getFirstName());
		emp.setLastName(employeeDetails.getLastName());
		emp.setEmailId(employeeDetails.getEmailId());

		return empRepository.save(emp);
	}

	@Override
	public void deleteEmployee(Long empId) {
		empRepository.deleteById(empId); 
	}

}
