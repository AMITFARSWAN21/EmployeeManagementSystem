package com.management.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.system.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	List<Employee> findByName(String name);
	List<Employee> findByDepartment(String department);
}
