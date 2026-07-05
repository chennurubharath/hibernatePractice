package com.hibenate.hibernatePractice.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hibenate.hibernatePractice.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> getAll(){
		
		TypedQuery<Person> namedQuery=entityManager.createNamedQuery("find_all_persons", Person.class	);
		return namedQuery.getResultList();
	}
	
	public Person	findById(int id)
	{
		return entityManager.find(Person.class, id);
		
	}
	public Person	update(Person person)
	{
		return entityManager.merge(person);//if avaible update, else if not avaible add personid
		
	}
	public Person insert(Person person) {
		// TODO Auto-generated method stub
		return  entityManager.merge(person);
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Person id1=entityManager.find(Person.class, id);
	//  entityManager.remove(id1);
	}
	
	
}
