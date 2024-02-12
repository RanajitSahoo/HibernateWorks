package com.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.util.Address;

@Entity
public class Principal {
	
	@Id
	@GenericGenerator(name = "i", strategy = "com.jsp.util.PrincipalId")
	@GeneratedValue(generator = "i")
	private String princpal_id;
	private String p_name;
	private int p_age;
	private int p_experience;
	private double p_salary;
	private Address address;
	@OneToOne(cascade = CascadeType.MERGE)
	private School school;
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getPrincpal_id() {
		return princpal_id;
	}
	public void setPrincpal_id(String princpal_id) {
		this.princpal_id = princpal_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public int getP_experience() {
		return p_experience;
	}
	public void setP_experience(int p_experience) {
		this.p_experience = p_experience;
	}
	public double getP_salary() {
		return p_salary;
	}
	public void setP_salary(double p_salary) {
		this.p_salary = p_salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Principal() {
	}
	@Override
	public String toString() {
		return "Principal [princpal_id=" + princpal_id + ", p_name=" + p_name + ", p_age=" + p_age + ", p_experience="
				+ p_experience + ", p_salary=" + p_salary + ", address=" + address + ", school=" + school + "]";
	}
	
	
}
