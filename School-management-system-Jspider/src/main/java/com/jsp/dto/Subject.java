package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Subject {
	@Id
	@GenericGenerator(name="i",strategy = "com.jsp.util.SubjectCode")
	@GeneratedValue(generator = "i")
	private String subcode;
	private String name;
	private String author;
	private int duration;
	@OneToOne(cascade = CascadeType.MERGE)
	private Teacher teacher;
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Student> students;
	
	@Override
	public String toString() {
		return "Subject [subcode=" + subcode + ", name=" + name + ", author=" + author + ", duration=" + duration
				+ ", teacher=" + teacher + ", students=" + students + "]";
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSubcode() {
		return subcode;
	}
	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
