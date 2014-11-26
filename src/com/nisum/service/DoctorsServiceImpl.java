package com.nisum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nisum.bean.Doctor;
import com.nisum.dao.DoctorsDao;

public class DoctorsServiceImpl implements DoctorsService {

	@Autowired
	private DoctorsDao dao;
	
	
	public void addDoctor(Doctor doctor) {
		dao.addDoctor(doctor);

	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return dao.getDoctors();
	}

}
