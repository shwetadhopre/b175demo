package com.springboot.service;

import java.util.List;

import com.springboot.model.Student;

public interface StudentServiceI {

	  public void saveData(Student s);
	public List<Student> loginStudent(String username, String password);
	public List<Student> deleteData(String name);
	
	public List<Student> updateStudent(Student s);
	public Student editData(int rollno);
	  
	  

}
