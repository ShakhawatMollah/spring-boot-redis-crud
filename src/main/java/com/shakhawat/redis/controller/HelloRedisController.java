package com.shakhawat.redis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shakhawat.redis.dao.EmployeeDao;
import com.shakhawat.redis.model.Employee;

@RestController
public class HelloRedisController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping("/getAllEmployee")
	public  Map<Integer, Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
		employeeDao.saveEmployee(emp);
		return "Save Successfully";
	}
	
	@GetMapping("/getEmployeeById")
	public String getEmployeeById(@RequestBody Integer empId) {
		Employee emp = employeeDao.getOneEmployee(empId);
		if(null == emp) {
			return "Employee not found by the id: " + empId;
		}
		return "Found: " + emp;
	}

}
