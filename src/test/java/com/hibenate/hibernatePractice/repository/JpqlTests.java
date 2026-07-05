package com.hibenate.hibernatePractice.repository;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HibernatePracticeApplication.class)
class JpqlTests {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
		@Autowired
		EntityManager em;
	

	@Test
	void findbyidmethod() {
		logger.info("stared first jpql ");
		
			
		List resultlist=em.createQuery("Select c from Course c").getResultList();
		
		logger.info("Select c from Course c"+resultlist);
		
	}
	
	@Test
	void findby_Typed() {
		logger.info("stared first jpql ");
		
			
		List resultlist=em.createQuery("Select c from Course c").getResultList();
		
		logger.info("Select c from Course c"+resultlist);
		
	}
	
	@Test
	void findby_namedQueries() {
		logger.info("stared first jpql ");
		
			
		TypedQuery<Course> query=em.createNamedQuery("query_get_all_courses", Course.class);
				
			List<Course> resultlist=	query.getResultList();
		
		
				logger.info("Select c from Course c"+resultlist);
		
	}
	
	@Test
	void findby_named_where() {
		logger.info("stared first jpql ");
		
			
		TypedQuery<Course> query=em.createNamedQuery("query_get_100_courses", Course.class);
				
			List<Course> resultlist=	query.getResultList();
		
		
				logger.info("Select c from Course c"+resultlist);
		
	}	
	
	



}
