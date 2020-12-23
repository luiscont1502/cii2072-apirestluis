package com.example.demo.models.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public class Person {
	
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="place_of_birth")
	private String placeOfBirth;
	@Column(name="email")
	private String email;	
	@Column(name="birth")
	@DateTimeFormat(pattern="yyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar birth;
	@Column(name="sex",length=1)
	private String sex;
	@Column(name="phone")
	private String phone;
	
	@Column(name="place_carg_id")
	private String numberCardId;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	public String getNumberCardId() {
		return numberCardId;
	}
	public void setNumberCardId(String numberCardId) {
		this.numberCardId = numberCardId;
	}
	@Override
	public String toString() {
		return this.firstname+""+this.lastname;
	}

	
	
	
	
	
}
