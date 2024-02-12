package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.jsp.util.Address;

@Entity
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	private String name;
	private int age;
	private int mark;
	private Address address;
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Subject> subjects;
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Teacher> teachers;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Principal principal;
	@ManyToOne(cascade = CascadeType.MERGE)
	private School school;
	@ManyToOne(cascade = CascadeType.MERGE)
	private ClassRoom classRoom;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", mark=" + mark + ", address="
				+ address + ", subjects=" + subjects + ", teachers=" + teachers + ", principal=" + principal
				+ ", school=" + school + ", classRoom=" + classRoom + "]";
	}

}
