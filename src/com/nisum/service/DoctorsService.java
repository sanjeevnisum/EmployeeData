package com.nisum.service;

import java.util.List;

import com.nisum.bean.Doctor;

public interface DoctorsService {
	
	void addDoctor(Doctor doctor);
	List<Doctor> getDoctors();

}
