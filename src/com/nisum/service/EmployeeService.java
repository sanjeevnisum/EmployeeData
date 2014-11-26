package com.nisum.service;

import java.util.List;

import com.nisum.bean.Employee;

public interface EmployeeService {
	void addEmployee(Employee employee);
	List employeesList();
	void updateEmployee(Employee employee);
	Employee getEmployee(Integer id);
	void deleteEmployee(Integer id);
	
	List<Integer> employeeIds();
	
	
	

}
