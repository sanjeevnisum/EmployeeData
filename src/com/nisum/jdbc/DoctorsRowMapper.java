package com.nisum.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nisum.bean.Doctor;

public class DoctorsRowMapper implements RowMapper<Doctor> {

	public Doctor mapRow(ResultSet arg0, int arg1) throws SQLException {
		Doctor doc=new Doctor();
		doc.setDoctorId(arg0.getInt(1));
		doc.setDoctorName(arg0.getString(2));
		doc.setSpecialization(arg0.getString(3));
		return doc;
	}

}
