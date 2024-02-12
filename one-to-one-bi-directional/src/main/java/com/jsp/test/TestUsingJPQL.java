package com.jsp.test;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestUsingJPQL {

	public static void main(String[] args) {
		String jpql="select p from Person p";

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		Query q= em.createQuery(jpql);
		List list=q.getResultList();
		ListIterator li=  list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
