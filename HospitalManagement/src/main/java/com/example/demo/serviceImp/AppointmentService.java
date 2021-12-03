package com.example.demo.serviceImp;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.Repository.AppointmentRepo;
import com.example.demo.model.Appointment;

import java.util.List;

	@Service
	public class AppointmentService {

	    @Autowired
	    private AppointmentRepo appointmentRepository;

	    public List<Appointment> listAll(){
	        return appointmentRepository.findAll();
	    }

	    public Appointment get(long id){
	        return appointmentRepository.findById(id).get();

	    }

	    public void save(Appointment appointment){
	        appointmentRepository.save(appointment);
	    }

	    public Appointment update(Appointment appointment ){
	        return appointmentRepository.save(appointment);
	    }

	    public void delete(long id){
	        appointmentRepository.deleteById(id);
	    }

	}


