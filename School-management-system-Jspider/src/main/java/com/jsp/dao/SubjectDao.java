package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Subject;

public class SubjectDao {

	public Subject saveSchool(Subject subject) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(subject);
		et.commit();
		return subject;
	}

	public Subject getSubjectById(String subjectCode) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Subject s = em.find(Subject.class, subjectCode);
		et.commit();
		return s;
	}

	public List<Subject> getSubjectByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from Subject s where s.name=?1";
		Query q = em.createQuery(sql);
		q.setParameter(1, name);
		List<Subject> subjects = q.getResultList();
		return subjects;

	}

	public List<Subject> getAllSubject() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from Subject s";
		Query q = em.createQuery(sql);
		List<Subject> subjects = q.getResultList();
		return subjects;
	}

	public void deleteSubjectById(String subjectCode) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Subject s = em.find(Subject.class, subjectCode);
		em.remove(s);
		et.commit();

	}

	public Subject updateSubject(Subject subject) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Subject s = em.merge(subject);
		et.commit();
		return s;
	}
}
