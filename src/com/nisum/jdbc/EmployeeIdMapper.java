package com.nisum.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nisum.bean.Employee;


public class EmployeeIdMapper implements RowMapper<Employee> {

		public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {
			
			Employee employee=new Employee();
			employee.setEmployeeId(arg0.getInt(1));
			return employee;
}
}