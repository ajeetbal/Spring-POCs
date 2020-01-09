package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add/employee")
	public Employee addEmployee(@RequestParam("name") String name, @RequestParam("empId") String empId) {
		return employeeService.createEmployee(name, empId);
	}

	@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
	public String removeEmployee(@RequestParam("empId") String empId) {
		employeeService.deleteEmployee(empId);
		return "Employee removed";
	}

}