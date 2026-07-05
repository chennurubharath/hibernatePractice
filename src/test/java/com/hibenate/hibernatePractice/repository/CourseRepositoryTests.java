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

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HibernatePracticeApplication.class)
class CourseRepositoryTests {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository courseRepository;

	@Test
	void findbyidmethod() {
		Course course=courseRepository.findByid(100L);
		
		logger.info("Testing is running");
		assertEquals("AWS", course.getName());
		
	}

	
	@Test
	@DirtiesContext
	void deleteidmethod() {
		courseRepository.deleteByid(110L);
		logger.info("delete  is running");
		assertNull(courseRepository.findByid(110L));
		
		
		
	}
	
	@Test
	void save_basics() {
		Course course=courseRepository.findByid(100L);
		
		assertEquals("AWS", course.getName());
		
		course.setName("AWS --updated");
		
		courseRepository.save(course); 
			Course course1=courseRepository.findByid(100L);
		assertEquals("AWS --updated", course1.getName());
		
}
	@Test
	void playwithEntityManager() {
		courseRepository.playwithentityManager();
	
		
}	


}
