package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.School;

public class SchoolDao {

	public School saveSchool(School school) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(school);
		et.commit();
		return school;
	}

	public School getSchoolById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		School s = em.find(School.class, id);
		et.commit();
		return s;
	}

	public List<School> getSchoolByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from School s where s.name=?1";
		Query q = em.createQuery(sql);
		q.setParameter(1, name);
		List<School> list = q.getResultList();
		return list;

	}

	public List<School> getAllSchool() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from School s";
		Query q = em.createQuery(sql);
		List<School> list = q.getResultList();
		return list;
	}

	public void deleteSchoolById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		School s = em.find(School.class, id);
		em.remove(s);
		et.commit();

	}

	public School updateSchool(School school) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		school.setName("rrr");
		School s = em.merge(school);
		et.commit();
		return s;
	}

}
