package com.nisum.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nisum.bean.Doctor;
import com.nisum.jdbc.DoctorsRowMapper;

public class DoctorsDaoImpl implements DoctorsDao {

@Autowired
private JdbcTemplate jdbcTemplate;

	public void addDoctor(Doctor doctor) {
		int id=doctor.getDoctorId();
		String name=doctor.getDoctorName();
		String spec=doctor.getSpecialization();
		jdbcTemplate.update("insert into doctors values(?,?,?)",id,name,spec);

	}

	public List<Doctor> getDoctors() {
		
		return jdbcTemplate.query("select * from doctors", new DoctorsRowMapper());
	}

}
