package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.Student;
import com.springboot.service.StudentServiceI;



@Controller
public class HomeController 
{
	@Autowired
	StudentServiceI ssi;
	
  @RequestMapping("/")
  public String firstlink()
  {
	  
	  System.out.println("in login");
	  
	  return "login";
  }
	@RequestMapping("/Register")
	public String secondlink()
	{
		System.out.println("in registerpage");
		
		return "Register";
		
	}
	
	@RequestMapping("/save")
	public String savedatareg(@ModelAttribute Student s,Model m)
	{
		
	   	ssi.saveData(s);
		return "login";
	}
	@RequestMapping("/log")
	public String retrivedata(@RequestParam String username ,@RequestParam String password,Model m)
	{
		
		List<Student>list = ssi.loginStudent(username,password);
			
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
			return "success";
		}
		else
		{
			return "login";
		}	
		
	}
	 @RequestMapping("/delete")
	public String deleteDAta(@RequestParam String name,Model m)
	{
		 ssi.deleteData(name);
		  List<Student>list  = ssi.deleteData(name);
		  m.addAttribute("data", list);
		  
		       return "success";
		 
	}
	 @RequestMapping("/edit")
	 public String updateData(@RequestParam int rollno,Model m)
	 {
		 Student s = ssi.editData(rollno);
		    m.addAttribute("data",s);
		 return "edit";
	 }
	 
	 
	 
	 
	 
	@RequestMapping("/update")
	 public String seeAllData(@ModelAttribute Student s,Model m)
	 {
		List<Student> p = ssi.updateStudent(s);
		    m.addAttribute("data",p);
		      
		return "success";
	 }
	
	
	
	
	
	
	
	
}