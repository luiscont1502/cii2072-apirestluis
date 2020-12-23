package com.example.demo.services.interfaces;

import java.util.List;

import com.example.demo.models.entities.Category;

public interface ICategoryService {

	public void save(Category c);//create-update
	
	public Category findById(Long id);//retrieve
	
	public void delete(Long id);//delete
	
	public List<Category> findAll();//list
	
}
