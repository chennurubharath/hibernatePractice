package com.hibenate.hibernatePractice.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibenate.hibernatePractice.entity.Course;
import com.hibenate.hibernatePractice.entity.Review;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
	
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager entityManager;

	
		public Course findByid(long id) {
			
			return entityManager.find(Course.class, id);
		}
		
public void deleteByid(long id) {
	Course course=entityManager.find(Course.class, id);
			
		 entityManager.remove(course);
					
		}


public Course save(Course course1) {
	
	//Course course1 =entityManager.find(Course.class, course.getId());
	if(course1.getId()== null) {
	 entityManager.persist(course1);
		
	}else {
		entityManager.merge(course1);
	}
	return course1;
	
	
	
}

public void playwithentityManager() {
	
	logger.info("playwithentityManager -started");
	Course course1=new Course("Web servces in 100 steps");

	entityManager.persist(course1);
//	entityManager.flush();


//entityManager.flush();
Course course2=new Course("Angular in 100 steps");


//entityManager.persist(course2);

entityManager.flush();
//entityManager.detach(course2);
//entityManager.detach(course1);
//entityManager.clear();
//course1.setName("Web servces in 100 steps- updated");
//course2.setName("Angular in 100 steps- updated");
entityManager.refresh(course1);
}

public void addreviewforCourse() {
	// TODO Auto-generated method stub
	
	
	Course course=findByid(10001L);
	logger.info("addreviewforCourse{},"+course.getReviews());
	
	Review review1= new Review("5", "Great hands on stuff");
	Review review2= new Review("5", "Great hands on stuff");
	
	course.addReviews(review1);
	course.addReviews(review2);
	
	review2.setCourse(course);
	review1.setCourse(course);
	entityManager.persist(review1);
	entityManager.persist(review2);
	
	
	
}
}
