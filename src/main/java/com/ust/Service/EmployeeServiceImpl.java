package com.ust.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Repository.EmployeeRepository;
import com.ust.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			repo.save(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Employee> getAll() {
		return repo.findAll();
	}

}
