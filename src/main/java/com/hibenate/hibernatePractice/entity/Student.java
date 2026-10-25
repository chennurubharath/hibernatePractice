package com.hibenate.hibernatePractice.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@OneToOne
	private Passport passport;
	
	protected	 Student() {
		
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}







	public Student(Long id, String name, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
	}







	public Student(String name, Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
	}





	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}



	public Passport getPassport() {
		return passport;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}



	public void setPassport(Passport passport) {
		this.passport = passport;
	}







	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}



/*	public String toString() {
		return String.format("Student[%s]",name);
		
	}*/
	
	
	
	
	
	
}
