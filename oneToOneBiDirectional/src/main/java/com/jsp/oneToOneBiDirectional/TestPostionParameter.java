package com.jsp.oneToOneBiDirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestPostionParameter {

	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dbConfig").createEntityManager();
		String jpql="select s from Student s where s.name=?1 and s.age=?2";
		Query q=em.createQuery(jpql);
		q.setParameter(1, "Ranajit");
		q.setParameter(2, 27);
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
