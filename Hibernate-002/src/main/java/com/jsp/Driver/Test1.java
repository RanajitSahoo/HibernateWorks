package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.DataTransferObject.Company;
import com.jsp.DataTransferObject.GST;

public class Test1 {

	public static void main(String[] args) {
		Company c=new Company();
		GST g=new GST();
		c.setName("TCS");
		c.setLoc("ITPL");
		c.setNoEmp(20000);
		c.setGst(g);
		g.setNumber("GST867681T");
		g.setCost(1000);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(c);
		em.persist(g);
		et.commit();
		System.out.println("successfully added");

	}

}
