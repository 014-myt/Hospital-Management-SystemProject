package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Admin;
import com.example.demo.model.Doctor;
import com.example.demo.serviceImp.DoctorService;

@Controller
public class DoctorController {

	DoctorService Docser;

	public DoctorController(DoctorService docser) {
		super();
		Docser = docser;
	}
	@GetMapping("/doctorget")
	public String listUserss(Model model)
		{
			model.addAttribute("Admin",Docser.getAllUsers());
			return "Doc_List";
      	}
	@PostMapping("/doctorsave")
	public String saveUser(@ModelAttribute("obj3") Doctor doctor)
	{
		Docser.saveuser(doctor);
		return "redirect:/Doc_list";
     }
	@PostMapping("/Mydoctor/update/{id}")
	public String updateStudent(@PathVariable long id,@ModelAttribute("admin") Doctor adm, Model model)
	{
		System.out.println("hello");
	    Doctor exist=Docser.getUserId(id);
		exist.setId(id);
		exist.setName(adm.getName());
		exist.setSpeaclist(adm.getSpeaclist());
		return "redirect:/Doc_list";
	}
	@GetMapping("/Mydoctor/delete/{id}")
	public String DeleteStudent(@PathVariable Long id)
	{
     	Docser.deletedocId(id);
		return  "redirect:/Doc_list";
	}
	
	
}