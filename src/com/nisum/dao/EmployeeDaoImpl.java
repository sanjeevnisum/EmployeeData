package com.nisum.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nisum.bean.Employee;
import com.nisum.jdbc.EmployeeIdMapper;
import com.nisum.jdbc.UserRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	
	
	public void addEmployee(Employee employee) {
		int empId=employee.getEmployeeId();
		String firstname=employee.getFirstname();
		String lastname=employee.getLastname();
		String desg=employee.getDesg();
		
	    jdbcTemplate.update("insert into employee values(?,?,?,?)",empId,firstname,lastname,desg);
	    
	    
	    
		
	}
	
	public void updateEmployee(Employee employee) {
		
		String sql="update employee set first_name =?,last_name =?,desg=? where employee_id=?";
		jdbcTemplate.update(sql,new Object[]{employee.getFirstname(),employee.getLastname(),employee.getDesg(),employee.getEmployeeId()});
		
	}

	public List<Employee> employeesList() {
		List list=jdbcTemplate.query("select * from employee",new UserRowMapper());
		return list;
	}

	public Employee getEmployee(Integer empId) {
		List<Employee> empList=new ArrayList<Employee>();
		empList=jdbcTemplate.query("select * from employee where employee_id="+empId,new UserRowMapper());
		return empList.get(0);
	}

	public void deleteEmployee(Integer id) {
		jdbcTemplate.update("delete from employee where employee_id="+id);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List employeeIds() {
		//return jdbcTemplate.query("select employee_id from employee", new EmpoyeeIdMapper());
		return jdbcTemplate.query("select employee_id from employee", new EmployeeIdMapper());
	}
	
	
	
	
	
	
	
	
	
	

}
