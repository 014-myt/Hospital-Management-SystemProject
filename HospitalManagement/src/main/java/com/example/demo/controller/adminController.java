package com.example.demo.controller;

import java.util.Objects;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.model.Admin;
import com.example.demo.serviceImp.AdminService;

@Controller
public class adminController {

	private AdminService obj1;

	public adminController(AdminService obj1) {
		super();
		this.obj1 = obj1;
	}
	@GetMapping("/get")
	public String listUserss(Model model)
	{
		model.addAttribute("Admin",obj1.getAllUsers());
		return "Welcome";
	}
	@GetMapping("/gett")
	public String listUsers(Model model)
	{
		model.addAttribute("Admin",obj1.getAllUsers());
			return "admin";
	}
	
	@GetMapping("/get/new")
	public String createUser(Model model)
	{
		Admin obj3 =new Admin();
		model.addAttribute("obj3",obj3);
		return "create_user";
	}
	@PostMapping("/getmy")
	public String saveUser(@ModelAttribute("obj3") Admin admin)
	{
		obj1.saveuser(admin);
		return "redirect:/get";
	}
	@GetMapping("get/update/{id}")
	public String editUserForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("admin",obj1.getUserId(id));	
	   return "edit_admin";	
	}
	@PostMapping("/Myadmin/{id}")
	public String updateStudent(@PathVariable long id,@ModelAttribute("admin") Admin adm, Model model)
	{
		System.out.println("hello");
		Admin exist=obj1.getUserId(id);
		exist.setId(id);
		exist.setName(adm.getName());
		exist.setEmail(adm.getEmail());
		return "redirect:/get";
	}
	@GetMapping("/get/delete/{id}")
	public String DeleteStudent(@PathVariable long id)
	{
     	obj1.deleteId(id);
		return  "redirect:/gett";
	}
}
