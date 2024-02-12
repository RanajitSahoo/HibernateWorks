package com.jsp.test;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestUsingNamedParameter {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em=emf.createEntityManager();
		String jpql="select p from Person p where p.name=:name and p.age=:age";//Named parameter
		Query q= em.createQuery(jpql);
		q.setParameter("name", "abdul");
		q.setParameter("age", 26);
		List list=q.getResultList();
		
		if(!list.isEmpty()) {
			ListIterator li=  list.listIterator();
			while(li.hasNext()) {
				System.out.println(li.next());
			}
		}
		else {
			System.out.println("-----0");
		}

	}

}
