package com.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Student;
@Repository
public interface StudentRepository  extends CrudRepository<Student, Integer>
{

	List<Student> findByUsernameAndPassword(String username, String password);

	public void  deleteByName(String name);
   
	 
	
}
