package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Admin;

public interface Adminservice {
	List<Admin> getAllUsers();
    Admin saveuser(Admin adm);
    Admin updateuser(Admin adm);
    Admin getUserId (long id);
  public  Admin loginUser(String uname,String password);
  public  void deleteId(long id);
}
