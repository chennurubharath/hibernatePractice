package com.hibenate.hibernatePractice.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
@NamedQuery(name="find_all_persons" ,	query="select p from Person p")
public class Person {
	
	@Id
	//@GeneratedValue
	private int id;
	private String name;
	private String location;
	private Date birthdate;
	
	public Person() {
		
	}

	public Person(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}

	public Person(String name, String location, Date birthdate) {
		super();
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
		

}
