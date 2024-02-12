package com.jsp.oneToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Asish");
		s.setAge(25);
		IdCard id=new IdCard();
		id.setName("SOA uni");
		id.setStudent(s);
		s.setIdcard(id);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(id);
		em.persist(s);
		et.commit();

	}

}
