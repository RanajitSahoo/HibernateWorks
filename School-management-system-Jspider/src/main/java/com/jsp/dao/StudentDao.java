package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {

	public Student saveStudent(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}

	public Student getStudentById(int rollNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Student s = em.find(Student.class, rollNo);
		et.commit();
		return s;
	}

	public List<Student> getStudentByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from Student s where s.name=?1";
		Query q = em.createQuery(sql);
		q.setParameter(1, name);
		List<Student> list = q.getResultList();
		return list;

	}

	public List<Student> getAllStudent() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select s from Student s";
		Query q = em.createQuery(sql);
		List<Student> list = q.getResultList();
		return list;
	}

	public void deleteStudentById(int rollNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Student s = em.find(Student.class, rollNo);
		em.remove(s);
		et.commit();

	}

	public Student updateStudent(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Student s = em.merge(student);
		et.commit();
		return s;
	}
}
