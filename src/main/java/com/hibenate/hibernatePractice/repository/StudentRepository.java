package com.hibenate.hibernatePractice.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibenate.hibernatePractice.entity.Passport;
import com.hibenate.hibernatePractice.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class StudentRepository {
	
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager entityManager;

	
		public Student findByid(long id) {
			
			return entityManager.find(Student.class, id);
		}
		
public void deleteByid(long id) {
	Student Student=entityManager.find(Student.class, id);
			
		 entityManager.remove(Student);
					
		}


public Student save(Student Student1) {
	
	
	if(Student1.getId()== null) {
	 entityManager.persist(Student1);
		
	}else {
		entityManager.merge(Student1);
	}
	return Student1;
	
	
	
}

public void saveStudentwithPassport() {
	
	
	logger.info("saveStudentwithPassport -started");
	
	Passport passport=new Passport("Q123456");
	entityManager.persist(passport);
	Student student1=new Student("Web servces in 100 steps");
	student1.setPassport(passport);
	entityManager.persist(student1);

}
}
