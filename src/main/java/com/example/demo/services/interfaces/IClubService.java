package com.example.demo.services.interfaces;

import java.util.List;

import com.example.demo.models.entities.Club;

public interface IClubService {
	
	
	public Club findById(Long id);//retrieve
	

	
	public List<Club> findAll();//list
}
