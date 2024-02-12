package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Principal;

public class PrincipalDao {
	public void savePrincipal(Principal principal) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(principal);
		et.commit();
	}

	public Principal getPrincipalById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Principal p = em.find(Principal.class, id);
		et.commit();
		return p;
	}

	public List<Principal> getPrincipalByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select p from Principal p where p.p_name=?1";
		Query q = em.createQuery(sql);
		q.setParameter(1, name);
		List<Principal> list = q.getResultList();
		return list;
	}

	public List<Principal> getAllPrincipal() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select p from Principal p";
		Query q = em.createQuery(sql);
		List<Principal> list = q.getResultList();
		return list;
	}

	public void deletePrincipalById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Principal p = em.find(Principal.class, id);
		em.remove(p);
		et.commit();
	}

	public void updatePrincipal(Principal principal) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(principal);
		et.commit();
	}
}
