package com.jsp.DataTransferObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gst_info")
public class GST {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gstId")
	private int id;
	@Column(name = "gstNum")
	private String number;
	@Column(name = "gstcost")
	private double cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
