package com.example.demo.model;

@Entity
public class Patient {
	@Id
	long patientId;
	String patientname;
	String bloodgroup;
	long mobileno;
	String password;
	int age;
	String gender;
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(long id) {
		this.age = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Patient(long patientId, String patientname, String bloodgroup, long mobileno, String password, int age,
			String gender) {
		super();
		this.patientId = patientId;
		this.patientname = patientname;
		this.bloodgroup = bloodgroup;
		this.mobileno = mobileno;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}

}
