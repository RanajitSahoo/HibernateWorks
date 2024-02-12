package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entityclasses.Identity;
import com.jsp.Entityclasses.Person;

public class BiDirOTOTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("suhana");
		p.setAge(26);
		Identity i=new Identity();
		i.setName("Passport");
		i.setNumber(38797237);
		i.setPerson(p);
		p.setIdentity(i);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(i);
		em.persist(p);
		et.commit();

	}

}
