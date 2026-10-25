package com.hibenate.hibernatePractice;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hibenate.hibernatePractice.entity.Course;
import com.hibenate.hibernatePractice.entity.Person;
import com.hibenate.hibernatePractice.repository.CourseRepository;
import com.hibenate.hibernatePractice.repository.JpaRepository;
import com.hibenate.hibernatePractice.repository.StudentRepository;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class HibernatePracticeApplication  implements CommandLineRunner{

	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	JpaRepository personJparepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	CourseRepository courseRepository;
	public static void main(String[] args) {
		SpringApplication.run(HibernatePracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		logger.info("User id 1001 ->{}"+personJparepository.update(new Person(100,"bharath", "Banglore", new Date())));
		
	Person p=	personJparepository.findById(100);
		logger.info("User id 100 ->{}"+p.getName());
		
		logger.info("User insert ->{}"+personJparepository.insert(new Person(103,"raja", "Banglore", new Date())));
		
		personJparepository.delete(1);
		
		
		logger.info("getAll --"+personJparepository.getAll());
		*/
		
	//	Course course=courseRepository.findByid(100L);
		
		//logger.info("person"+course);
		
		
		//courseRepository.deleteByid(110L);
		
		//courseRepository.save(new Course("micor services in 100 steps --updated"));
		
		
	//studentRepository.saveStudentwithPassport();
		
		courseRepository.addreviewforCourse();
		
		}
		
	}


