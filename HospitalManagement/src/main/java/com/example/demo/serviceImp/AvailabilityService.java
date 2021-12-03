package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AvailabilityRepo;
import com.example.demo.model.Availability;

@Service
public class AvailabilityService {
	    @Autowired
	    private AvailabilityRepo availabilityDatesRepository;

	    public List<Availability> listAll(){
	        return availabilityDatesRepository.findAll();
	    }

	    public Availability get(long id){
	        return availabilityDatesRepository.findById(id).get();

	    }

	    public void save(Availability availabilityDates){
	        availabilityDatesRepository.save(availabilityDates);
	    }

	    public Availability update(Availability availabilityDates ){
	        return availabilityDatesRepository.save(availabilityDates);
	    }

	    public void delete(long id){
	        availabilityDatesRepository.deleteById(id);
	    }
	}

