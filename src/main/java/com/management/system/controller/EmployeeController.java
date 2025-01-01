package com.management.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.system.model.Employee;
import com.management.system.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

@Autowired
private EmployeeService employeeService;


@PostMapping
public Employee addEmployee(@RequestBody  Employee employee)
{
	return employeeService.saveEmployee(employee);
}

@GetMapping
public List<Employee> getAllEmployee()
{
	return employeeService.getAllEmployee();
}

@GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable   Long id)
{
	return employeeService.getEmployeeById(id);
}

@DeleteMapping("/{id}")
public void deleteEmployee( @PathVariable  Long id)
{
	employeeService.deleteEmployee(id);
}

@GetMapping("/name/{name}")
public List<Employee> getEmployeeByName(@PathVariable  String name)
{
	return employeeService.getEmployeeByName(name);
}

@GetMapping("/department/{department}")
public List<Employee> getEmployeeByDepartment(@PathVariable  String department)
{
	return employeeService.getEmployeeByDepartment(department);
}
 


}
