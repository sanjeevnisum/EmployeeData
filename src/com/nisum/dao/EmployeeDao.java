package com.nisum.dao;

import java.util.List;

import com.nisum.bean.Employee;

public interface EmployeeDao {
	
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	List<Employee> employeesList();
	Employee getEmployee(Integer empId);
	void deleteEmployee(Integer id);
	List<Integer> employeeIds();
	
	

}
