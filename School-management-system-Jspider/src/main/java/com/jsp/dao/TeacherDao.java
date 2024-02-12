package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {

	public Teacher saveTeacher(Teacher teacher) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(teacher);
		et.commit();
		return teacher;
	}

	public Teacher getTeacherById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Teacher t = em.find(Teacher.class, id);
		et.commit();
		return t;
	}

	public List<Teacher> getTeacherByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select t from Teacher t where t.name=?1";
		Query q = em.createQuery(sql);
		q.setParameter(1, name);
		List<Teacher> list = q.getResultList();
		return list;

	}

	public List<Teacher> getAllTeachers() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		String sql = "select t from Teacher t";
		Query q = em.createQuery(sql);
		List<Teacher> teachers = q.getResultList();
		return teachers;
	}

	public void deleteTeacherById(String id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Teacher teacher = em.find(Teacher.class, id);
		em.remove(teacher);
		et.commit();

	}

	public Teacher updateTeacher(Teacher teacher) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConfig");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Teacher t = em.merge(teacher);
		et.commit();
		return t;
	}
}
