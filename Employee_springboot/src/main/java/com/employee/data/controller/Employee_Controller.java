package com.employee.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.data.entity.Employee;
import com.employee.data.service_impl.Employee_Service_impl;

@Controller
public class Employee_Controller {
	
	@Autowired
	private Employee_Service_impl empserImpl;

	@GetMapping("/home")
	public String  viewhomepage(Model model) {
		model.addAttribute("allemplist",empserImpl.getallemployees());
		return "index"; 
	}
	@GetMapping("/addnew") 
	public String addnewemployee(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		return "newemployee";
	}
	
	@PostMapping("/save")
	public String saveemployee(@ModelAttribute("employee") Employee employee) {
		empserImpl.saveemployee(employee);
		return "redirect:/home";
	}
	
	@GetMapping("/showupdateform/{id}")
	public String updateemployee(@PathVariable int id,Model model) {
		Employee employee=empserImpl.getbyId(id);
		model.addAttribute("employee",employee);
		return "update";
	}
	@GetMapping("/deletebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		empserImpl.deletebyid(id);
		return "redirect:/home";
	}
		
	
	
}
