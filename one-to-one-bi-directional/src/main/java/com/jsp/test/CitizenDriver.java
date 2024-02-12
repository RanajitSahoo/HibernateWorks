package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entityclasses.Adhar;
import com.jsp.Entityclasses.Citizen;

public class CitizenDriver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Citizen c = new Citizen();
		Adhar a = new Adhar();
		c.setName("Ranajit Sahoo");
		c.setGender("male");
		a.setAddharnum("826279497777");
		a.setAddress("odisha");
		a.setCitizen(c);
		c.setAdhar(a);
		et.begin();
		em.persist(c);
		et.commit();
		em.close();
		System.out.println("inserted");

	}

}
