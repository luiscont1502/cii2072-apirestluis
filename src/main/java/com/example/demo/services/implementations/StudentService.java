package com.example.demo.services.implementations;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IStudent;
import com.example.demo.models.entities.Student;
import com.example.demo.services.interfaces.IStudentService;

public class StudentService implements IStudentService{

	@Autowired
	private IStudent dao;
	
	@Override
	@Transactional
	public void save(Student student) {
		try {
			dao.save(student);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public Student findById(Long id) {		
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Student> findAll() {		
		return (List<Student>) dao.findAll();
	}

}
