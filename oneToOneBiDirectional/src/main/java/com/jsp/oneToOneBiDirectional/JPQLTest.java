package com.jsp.oneToOneBiDirectional;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		String jpql="select s from Student s";
		Query q=em.createQuery(jpql);
		List<Student> students=q.getResultList();
		ListIterator<Student> list=students.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}

	}

}
