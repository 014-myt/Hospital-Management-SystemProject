package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Doctor;

public interface DoctorserInterface {

  public	List<Doctor> getAllUsers();
  public  Doctor saveuser(Doctor adm);
  public  Doctor getUserId(long id); 
  public void deletedocId(long id);
}
