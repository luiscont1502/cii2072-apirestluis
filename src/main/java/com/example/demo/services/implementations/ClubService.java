package com.example.demo.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IClub;
import com.example.demo.models.entities.Club;
import com.example.demo.services.interfaces.IClubService;

public class ClubService implements IClubService{

	@Autowired
	private IClub dao;

	@Override
	@Transactional(readOnly=true)
	public Club findById(Long id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Club> findAll() {		
		return (List<Club>) dao.findAll();
	}
	




}
