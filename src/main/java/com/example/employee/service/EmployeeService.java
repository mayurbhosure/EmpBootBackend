package com.example.employee.service;

import java.util.List;
import com.example.employee.model.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee emp);

	public Employee getEmployeeById(Long empId, Employee empDetails);

	public List<Employee> getEmployees();

	public Employee updateEmployee(Long empId, Employee employeeDetails);

	public void deleteEmployee(Long empId);
}
