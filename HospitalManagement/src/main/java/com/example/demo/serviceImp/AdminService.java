package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.AdminRepository;
import com.example.demo.model.Admin;
import com.example.demo.service.Adminservice;

@Service
public class AdminService implements Adminservice {

	private AdminRepository obj;
	public AdminService(AdminRepository obj)
	{
		this.obj=obj;
	}
	
	@Override
	public List<Admin> getAllUsers() {
		
		return obj.findAll();
	}

	@Override
	public Admin saveuser(Admin adm) {
		// TODO Auto-generated method stub
		return obj.save(adm);
	}
	public Admin getUserId(long id) {
		// TODO Auto-generated method stub
		return obj.findById(id).get();
	}
	@Override
	public Admin updateuser(Admin adm) {
		// TODO Auto-generated method stub
		return obj.save(adm);
	}

	@Override
	public void deleteId(long id) {
		// TODO Auto-generated method stub
		obj.deleteById(id);
	}

	@Override
	public Admin loginUser(String name, String email) {
		// TODO Auto-generated method stub
		Admin user=obj.findByNameAndEmail(name, email);
		return user;
	}
	
	
}
