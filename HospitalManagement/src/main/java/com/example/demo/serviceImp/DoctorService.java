package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.DoctorRepository;
import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorserInterface;

@Service
public class DoctorService implements DoctorserInterface {
  DoctorRepository Docrepo;

public DoctorService(DoctorRepository docrepo) {
	super();
	Docrepo = docrepo;
}

@Override
public List<Doctor> getAllUsers() {
	
	return Docrepo.findAll();
}

@Override
public Doctor saveuser(Doctor adm) {

	return Docrepo.save(adm);
}

public Doctor getUserId(long id) {
	// TODO Auto-generated method stub
	return Docrepo.getById(id);
}

@Override
public void deletedocId(long id) {
	// TODO Auto-generated method stub
	  Docrepo.deleteById(id);
}
}