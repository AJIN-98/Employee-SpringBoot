package com.ust.Service;

import java.util.List;

import com.ust.model.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);
	public List<Employee> getAll();
}
