package com.hibenate.hibernatePractice.repository;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.hibenate.hibernatePractice.HibernatePracticeApplication;
import com.hibenate.hibernatePractice.entity.Course;
import com.hibenate.hibernatePractice.entity.Passport;
import com.hibenate.hibernatePractice.entity.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HibernatePracticeApplication.class)
@Transactional
class StudentReposityTests {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	EntityManager em;

	@Test
	@Transactional
	void retrieveStudentAndPassportsDetails() {
		Student student=em.find(Student.class,1L);
		
		logger.info("Student{} ->",student);
		student.setPassport(student.getPassport());
		logger.info("passport ->",student.getPassport());
		
		
	}
	

	@Test
	@Transactional
	void sometests() {
		Student student=em.find(Student.class,952L);
		
		Passport passport=student.getPassport();
		
		passport.setPnumber("QQQQQQQ");
		
		student.setName("Ranga-updated");
		
		
	}
	
	
	@Test
	void retrievePassportAndStudentDetails() {
		Passport passport=em.find(Passport.class,1L);
		
		logger.info("passprt___________ ->",passport);
		logger.info("Student__________ ->",passport.getStudent());
		
		
	}
	
	

	

}
