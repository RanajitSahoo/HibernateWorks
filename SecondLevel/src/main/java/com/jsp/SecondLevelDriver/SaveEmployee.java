package com.jsp.SecondLevelDriver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.SecondLevelEntity.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
Employee e=new Employee();
		
		e.setName("Raja");
		
		e.setAge(22);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
	}

	

}
