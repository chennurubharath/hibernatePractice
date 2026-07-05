package com.hibenate.hibernatePractice.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity	
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false	)
	private String description;
	
	private String rating;
	
	@ManyToOne
	private Course course;
	
	
	
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Review() {
		
	}
	public Review(String rating,String description) {
		this.rating=rating;
		this.description=description;
	}
	public Long getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public void setName(String description) {
		this.description = description;
	}
	
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String toString() {
		return String.format("Review[%s%s]",rating,description);
		
	}
	
	
	
	
}
