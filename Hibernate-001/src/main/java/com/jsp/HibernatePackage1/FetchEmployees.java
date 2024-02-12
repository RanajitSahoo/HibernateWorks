package com.jsp.HibernatePackage1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchEmployees {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee e=em.find(Employee.class, 101);
		if(e!=null) {
			System.out.println(e);
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSal());
			System.out.println(e.getAddress());
		}
		et.commit();

	}

}
