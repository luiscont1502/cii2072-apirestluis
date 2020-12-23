package com.example.demo.services.implementations;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ICategory;
import com.example.demo.models.entities.Category;
import com.example.demo.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategory dao;
	
	
	@Override
	public void save(Category c) {
	dao.save(c);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Category c=this.findById(id);
		dao.delete(c);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>)dao.findAll();
	}

	

}
