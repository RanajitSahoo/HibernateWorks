package com.jsp.SecondLevelDriver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.SecondLevelEntity.Student;

public class InsertData {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s = new Student();
		s.setName("Ranajit Sahoo");
		s.setAge(23);
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("datainserted");
		

	}

}
