package com.hibenate.hibernatePractice.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;

@Entity	
public class Passport {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String pnumber;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Student student;
	
	
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public Passport() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public Passport(String pnumber) {
		
		this.pnumber = pnumber;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", pnumber=" + pnumber + ", student=" + student + "]";
	}
	
	
	

	/*
	 * public String toString() { return String.format("Passport[%s]",pnumber);
	 * 
	 * }
	 */
	
	
	
	
	
	
}
