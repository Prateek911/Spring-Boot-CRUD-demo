package com.projects.two.demoCRUD.DemoCRUDApplication.DAO;

import org.springframework.stereotype.Repository;

import com.projects.two.demoCRUD.DemoCRUDApplication.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

	//define field for entity Manager
	private EntityManager entityManager;
	
	
	//inject entity manager
	public StudentDAOImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	
	
	
	//implement save method
	@Override
	@Transactional
	public void Save(Student theStudent) {
		entityManager.persist(theStudent);
		
	}
	

}
