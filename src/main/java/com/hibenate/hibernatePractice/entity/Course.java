package com.hibenate.hibernatePractice.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;

@Entity	
@NamedQueries(value= {
		@NamedQuery(name="query_get_all_courses",query="select c from Course c")
		,
		@NamedQuery(name="query_get_100_courses",query="select c from Course c where name like '%100 steps'")
})
public class Course {

	@Id
	@GeneratedValue
	private long id;
	
	
	private String name;
	
	
	@OneToMany(mappedBy = "course")
	private List<Review> reviews=new ArrayList();
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	public Course() {
		
	}
	
	
	
	
	public List<Review> getReviews() {
		return reviews;
	}




	public void addReviews(Review reviews) {
		this.reviews.add(reviews);
	}
	public void removeReviews(Review reviews) {
		this.reviews.remove(reviews);
	}




	public Course(String name) {
		this.name=name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", lastUpdatedDate=" + lastUpdatedDate + ", createdDate="
				+ createdDate + "]";
	}
	
	
	
	
	
}
