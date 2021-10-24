package com.ust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Service.EmployeeService;
import com.ust.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	ResponseEntity response;
	
	@PostMapping("/employee/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp)
	{
		try {
			service.addEmployee(emp);
			return new ResponseEntity<String>("added !",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("failed",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/employee/all")
	public ResponseEntity<?> getallEmp(){
		List<Employee> userList = service.getAll();
		if(userList!=null) {
			response = new ResponseEntity<List<Employee>>(userList,HttpStatus.OK);
		}
		else {
			response = new ResponseEntity<String>("Failure",HttpStatus.BAD_REQUEST);
		}
		return response;
	}
}
