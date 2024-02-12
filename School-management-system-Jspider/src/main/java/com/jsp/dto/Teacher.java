package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	@Id
	private String t_id;
	private String name;
	private int age;
	private int experience;
	@OneToOne(cascade = CascadeType.MERGE)
	private Subject subject;
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Student> students;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Principal principal;
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<ClassRoom> classRooms;
	@ManyToOne(cascade=CascadeType.MERGE)
	private School school;
	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", subject="
				+ subject + ", students=" + students + ", principal=" + principal + ", classRooms=" + classRooms
				+ ", school=" + school + "]";
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getT_id() {
		return t_id;
	}
	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}
	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
}
