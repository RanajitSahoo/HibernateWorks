package com.jsp.CompositeKey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {
	@EmbeddedId
	private CompositeKeyForEmployee cpk;
	private int sal;
	private int age;
	public CompositeKeyForEmployee getCpk() {
		return cpk;
	}
	public void setCpk(CompositeKeyForEmployee cpk) {
		this.cpk = cpk;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [cpk=" + cpk + ", sal=" + sal + ", age=" + age + "]";
	}
}
