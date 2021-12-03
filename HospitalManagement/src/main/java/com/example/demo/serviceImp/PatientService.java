package com.example.demo.serviceImp;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.Repository.PatientRepository;
import com.example.demo.model.Admin;
import com.example.demo.model.Patient;

import java.util.List;
	@Service
	public class PatientService {

	    @Autowired
	    private PatientRepository patientRepository;

	    public List<Patient> listAll(){
	        return patientRepository.findAll();
	    }

	    public Patient get(long id){
	        return patientRepository.findById(id).get();

	    }

	    public void save(Patient patient){
	        patientRepository.save(patient);
	    }
	    public Patient save(long patient){
	       return patientRepository.findById(patient).get();
	    }

	    
	    public void delete(long id){
	        patientRepository.deleteById(id);
	    }

		

	}


