package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Appointment {
	@Id
	long appointmentId;
    Date Appointmentdate;
    String AppointmentStatus;
    String Remarks;
   @ManyToOne
    private Doctor doc;
	public Appointment(long appointmentId, Date appointmentdate, String appointmentStatus, String remarks, Doctor doc) {
		super();
		this.appointmentId = appointmentId;
		Appointmentdate = appointmentdate;
		AppointmentStatus = appointmentStatus;
		Remarks = remarks;
		this.doc = doc;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Date getAppointmentdate() {
		return Appointmentdate;
	}
	public void setAppointmentdate(Date appointmentdate) {
		Appointmentdate = appointmentdate;
	}
	public String getAppointmentStatus() {
		return AppointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		AppointmentStatus = appointmentStatus;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
    
    
}
