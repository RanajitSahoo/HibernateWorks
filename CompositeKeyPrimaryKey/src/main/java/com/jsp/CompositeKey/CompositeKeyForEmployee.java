package com.jsp.CompositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class CompositeKeyForEmployee implements Serializable{
	private int id;
	private String Name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public String toString() {
		return "CompositeKeyForEmployee [id=" + id + ", Name=" + Name + "]";
	}
	public CompositeKeyForEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeKeyForEmployee other = (CompositeKeyForEmployee) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public CompositeKeyForEmployee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
}
