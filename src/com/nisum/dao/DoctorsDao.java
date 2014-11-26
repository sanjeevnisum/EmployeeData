package com.nisum.dao;

import java.util.List;

import com.nisum.bean.Doctor;

public interface DoctorsDao {
	
	void addDoctor(Doctor doctor);
	List<Doctor> getDoctors();

}
