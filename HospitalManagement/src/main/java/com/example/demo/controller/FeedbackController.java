package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Admin;
import com.example.demo.model.Feedback;
import com.example.demo.serviceImp.AdminService;
import com.example.demo.serviceImp.FeedbackService;

public class FeedbackController {

		private FeedbackService obj1;

		public FeedbackController(FeedbackService obj1) {
			super();
			this.obj1 = obj1;
		}
	
		@PostMapping("/getmy")
		public String saveUser(@ModelAttribute("obj3") Feedback admin)
		{
			obj1.save(admin);
			return "redirect:/getmy";
		}
		@GetMapping("get/update/{id}")
		public String editUserForm(@PathVariable Long id,Model model)
		{
			model.addAttribute("admin",obj1.get(id));	
		   return "Feedback";	
		}
		
		@GetMapping("/get/delete/{id}")
		public String DeleteStudent(@PathVariable long id)
		{
	     	obj1.delete(id);
			return  "redirect:/gett";
		}
	}


