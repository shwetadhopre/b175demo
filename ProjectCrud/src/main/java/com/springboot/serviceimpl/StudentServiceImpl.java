package com.springboot.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.springboot.model.Student;
import com.springboot.repository.StudentRepository;
import com.springboot.service.StudentServiceI;

import jakarta.transaction.Transactional;
@Service
public class StudentServiceImpl implements StudentServiceI
{

	@Autowired
	StudentRepository sr;
	@Override
	public void saveData(Student s) 
	{
		
		sr.save(s); 
		
		System.out.println("in service layer");
		
	}
	
	
	@Override
	public List<Student> loginStudent(String username, String password) 
	{
	  if(username.equals("admin")&&password.equals("admin"))
	  {
		  List<Student>list=(List<Student>) sr.findAll();
		         return list;
	  }
		
	  else
	  {
		       return sr.findByUsernameAndPassword(username,password);
	  }
		
		
	
		
	}

   @Transactional
   @Modifying
	@Override
	public List<Student> deleteData(String name) 
	{
		 sr.deleteByName(name);
		       
		return (List<Student>)sr.findAll(); 
	}
   
   
   @Override
   public Student editData(int rollno) 
   {
	   Optional<Student>op = sr.findById(rollno);
	   if
		   (!op.isEmpty())
		   {
			  Student t=op.get();
			  return t;  
		   }
	   
	   
	   
	   else {
		
	   return null ;
	   }
   }   
   
@Override
public List<Student> updateStudent(Student s) 
{
	sr.save(s);
	
	return (List<Student>)sr.findAll();
}





	
}
