package com.jsp.HibernatePackage1;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
//		e.setId(101);
		e.setName("raja");
		e.setSal(11000000);
		e.setAddress("Karnta");
		//Persistence is class which has createEntityManagerfactory method which returns EntityManagerFactory instance.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();//it is responsible for create transaction with database;
		et.begin();
		em.persist(e);//it is responsible for add data to the table;
		et.commit();
		System.out.println("successfully added");

	}

}
