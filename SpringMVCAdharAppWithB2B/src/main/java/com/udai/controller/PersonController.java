package com.udai.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udai.model.Person;
import com.udai.service.IPersonService;

@Controller
public class PersonController {

	@Autowired
	private IPersonService service;
	
	@GetMapping("/getForm")
	public String getEnrollPage(Model model) {
		model.addAttribute("person", new Person());
		return "Enrollment";
	}
	
	@PostMapping("/enroll")
	public String saveData(@ModelAttribute Person person,Model model) {
		
		System.out.println("person: "+person);
		long id=service.savePersonData(person);	
		model.addAttribute("msg","You Enrolled Success Fully With id:  "+id);
		
		model.addAttribute("person",new Person());
		return "Enrollment";
	}
	
	@GetMapping("/getInput")
	public String getInputpage() {
		
		return "input";
	}
	
	@PostMapping("/getData")
	public String getPersonData(@RequestParam long id,Model model) {
		System.out.println("Interger Id:"+id);
		Person person=service.getPersonData(id);
		System.out.println("person: "+person);
		if(person==null) {
			model.addAttribute("msg", "This is invalid Adhar Number enter Valid one");
			return "input";
		}
		else {
			model.addAttribute("person", person);
			return "Data";
		}
	}
}
