package com.ust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	@NotNull
	private String employeeName;
	@NotNull
	private String address;

	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
