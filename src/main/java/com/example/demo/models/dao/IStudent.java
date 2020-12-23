package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entities.Student;

public interface IStudent extends CrudRepository<Student,Long> {

}
