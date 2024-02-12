package com.jsp.Entityclasses;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Identity {
	@Override
	public String toString() {
		return "Identity [iid=" + iid + ", name=" + name + ", number=" + number  + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iid;
	
	private String name;
	private int number;
	@OneToOne()
	@JoinColumn
	private Person person;
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
