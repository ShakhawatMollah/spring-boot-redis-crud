package com.shakhawat.redis.model;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = -805175348187271734L;

	private Integer employeeId;
	
	private String employeeName;
	
	private Double employeeSalary;
	
	public Employee() {
		super();
	}

	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
