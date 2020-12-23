package com.example.demo.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Registration implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_registration")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idRegistration;
	
	
}
