package com.jsp.SecondLevelDriver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.SecondLevelEntity.Employee;

public class FetchEmployee {

	public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		
		EntityManager em1=emf.createEntityManager();
		Employee e1=em1.find(Employee.class,1);
		
		
		EntityManager em2=emf.createEntityManager();
		em2.find(Employee.class,1);
		
		EntityManager em3=emf.createEntityManager();
		
		System.out.println("entity manager 2"+em2.find(Employee.class,1));
		System.out.println("entity manager 3"+em3.find(Employee.class,1));

	}

}
