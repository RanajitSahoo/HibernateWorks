package com.jsp.ManytoOneUtility;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studRoll;
	private String studName;
	private int studAge;
	private int mark;
	@ManyToOne(cascade = CascadeType.ALL)
	private Subject studSub;
	public int getStudRoll() {
		return studRoll;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Subject getStudSub() {
		return studSub;
	}
	public void setStudSub(Subject studSub) {
		this.studSub = studSub;
	}

}
