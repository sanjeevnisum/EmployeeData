package com.nisum.jdbc;

  
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nisum.bean.Employee;
  
public class UserExtractor implements ResultSetExtractor<Employee> {  
  
 public Employee extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  Employee employee = new Employee();  
    
  employee.setEmployeeId(resultSet.getInt(1));  
  employee.setFirstname(resultSet.getString(2));  
  employee.setLastname(resultSet.getString(3));  
  employee.setDesg(resultSet.getString(4));  
  
    
  return employee;  
 }  
  
}  