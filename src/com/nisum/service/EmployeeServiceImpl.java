package com.nisum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nisum.bean.Employee;
import com.nisum.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired

	private EmployeeDao employeeDao;
	
	public void addEmployee(Employee employee) {
	
		employeeDao.addEmployee(employee);
		
	}

	public List employeesList() {
		List list=employeeDao.employeesList();
		return list;
	}

	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
		
	}

	public Employee getEmployee(Integer id) {
		return employeeDao.getEmployee(id);
	
	}

	public void deleteEmployee(Integer id) {
		employeeDao.deleteEmployee(id);
		
	}

	public List<Integer> employeeIds() {
		return employeeDao.employeeIds();
		
	}
	

}
