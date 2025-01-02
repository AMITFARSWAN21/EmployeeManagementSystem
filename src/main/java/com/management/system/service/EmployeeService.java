package com.management.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.system.model.Employee;
import com.management.system.repository.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;

public Employee saveEmployee(Employee employee)
{
	return employeeRepository.save(employee);
}

public List<Employee> getAllEmployee()
{
	return employeeRepository.findAll();
}

public Employee getEmployeeById(Long id)
{
	return employeeRepository.findById(id).orElse(null);
}

public void deleteEmployee(Long id)
{
	employeeRepository.deleteById(id);
}


public List<Employee> getEmployeeByName(String name) {
    return employeeRepository.findByNameContainingIgnoreCase(name);
}


public List<Employee> getEmployeeByDepartment(String department)
{
	return employeeRepository.findByDepartment(department);
}


}
