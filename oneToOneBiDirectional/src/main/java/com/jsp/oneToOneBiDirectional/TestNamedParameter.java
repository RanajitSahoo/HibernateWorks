package com.jsp.oneToOneBiDirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestNamedParameter {

	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		String jpql="select s from Student s where s.name=:name and s.age=:age";
		Query q=em.createQuery(jpql);
		q.setParameter("name", "Ranajit");
		q.setParameter("age", 26);
		List list=q.getResultList();
		if(!list.isEmpty()) {
			for(Object o:list) {
				System.out.println(o);
			}
		}else {
			System.out.println("data is not there");
		}

	}

}
