package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entities.Category;

public interface ICategory extends CrudRepository<Category,Long> {

}
