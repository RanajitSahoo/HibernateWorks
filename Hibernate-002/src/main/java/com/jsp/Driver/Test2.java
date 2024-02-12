package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.DataTransferObject.PIdentity;
import com.jsp.DataTransferObject.Person;

public class Test2 {

	public static void main(String[] args) {
		Person p=new Person();
		PIdentity i=new PIdentity();
		i.setName("Pan CArd");
		i.setNumber(243762893);
		p.setName("Ranajit");
		p.setAge(26);
		p.setIdentity(i);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		em.persist(i);
		et.commit();
		System.out.println("successfully added");


	}

}
