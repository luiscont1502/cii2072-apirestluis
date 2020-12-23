package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entities.Subject;

public interface ISubject extends CrudRepository<Subject,Long> {

}
