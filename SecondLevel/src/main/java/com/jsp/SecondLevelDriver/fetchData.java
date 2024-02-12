package com.jsp.SecondLevelDriver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import com.jsp.SecondLevelEntity.Student;

public class fetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		Student s = em1.find(Student.class, 1);
		
		
		Student s2 = em2.find(Student.class, 1);
		System.out.println(s);
		System.out.println(s2);
		emf.close();
		

	}

}
