package com.example.demo.services.interfaces;

import java.util.List;

import com.example.demo.models.entities.Student;

public interface IStudentService {
	public void save(Student student); //create-update
	public Student findById(Long id); //retrieve
	public void delete(Long id);	//delete
	public List<Student> findAll(); //list
	
	
}
