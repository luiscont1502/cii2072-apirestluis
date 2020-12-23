package com.exmaple.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.entities.Category;
import com.example.demo.services.interfaces.ICategoryService;
@RestController
@RequestMapping("/api/category")
public class CategoryController  {

		@Autowired
		private ICategoryService service;
		
		@GetMapping(value="/{id}")
		public Category retrive(@PathVariable(value="id") Long id) {
			return service.findById(id);
		}
		
		@GetMapping("")
		public List<Category> list(){
			return service.findAll();
		}
}
