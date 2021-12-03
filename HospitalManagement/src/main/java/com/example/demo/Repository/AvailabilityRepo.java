package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Availability;

public interface AvailabilityRepo extends JpaRepository<Availability,Long> {

}
