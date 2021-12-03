package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Availability {
	@Id
      long AvailabilityId;
      Date Fromdate;
      public Availability(long availabilityId, Date fromdate, Date endDate, Doctor doctor,Patient patient) {
		super();
		AvailabilityId = availabilityId;
		Fromdate = fromdate;
		this.endDate = endDate;
		this.doctor = doctor;
		this.patient=patient;
	}
	public long getAvailabilityId() {
		return AvailabilityId;
	}
	public void setAvailabilityId(long availabilityId) {
		AvailabilityId = availabilityId;
	}
	public Date getFromdate() {
		return Fromdate;
	}
	public void setFromdate(Date fromdate) {
		Fromdate = fromdate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	Date endDate;
 @OneToOne
      Doctor doctor;
 @OneToOne
 Patient patient;
}

