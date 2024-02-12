package com.jsp.HibernatePackage1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee e=em.find(Employee.class, 101);
		e.setName("Raja");
		e.setSal(20000);
		em.merge(e);
		et.commit();
		System.out.println("Employee updated");
	}

}
