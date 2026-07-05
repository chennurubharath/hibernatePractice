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
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HibernatePracticeApplication.class)
class nativequeryTests {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
		@Autowired
		EntityManager em;
	

	@Test
	void nativequerybasics() {
		logger.info("stared first jpql ");
		
			
		Query query=em.createNativeQuery("Select * from Course ", Course.class);
		
	List resultlist=	query.getResultList();
		logger.info("Select c from Course c"+resultlist);
		
	}
	
	@Test
	void nativequerybasics_withParameter() {
		logger.info("stared first jpql ");
		
			
		Query query=em.createNativeQuery("Select * from Course where id=?", Course.class);
		
		query.setParameter(1, 1952L);
	List resultlist=	query.getResultList();
		logger.info("Select c from Course c"+resultlist);
		
	}
	
	@Test
	void nativequerybasics_withParameter_namedparatmers() {
		logger.info("stared first jpql ");
		
			
		Query query=em.createNativeQuery("Select * from Course where id=:id", Course.class);
		
		query.setParameter("id", 1952L);
	List resultlist=	query.getResultList();
		logger.info("Select c from Course c"+resultlist);
		
	}
	


}
