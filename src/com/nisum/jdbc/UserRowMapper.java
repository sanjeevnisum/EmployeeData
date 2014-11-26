package com.nisum.jdbc;  
 
  
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nisum.bean.Employee;
  
public class UserRowMapper implements RowMapper<Employee> {  
  
 public Employee mapRow(ResultSet resultSet, int line) throws SQLException {  
  UserExtractor userExtractor = new UserExtractor();  
  return userExtractor.extractData(resultSet);  
 }  
  
}  