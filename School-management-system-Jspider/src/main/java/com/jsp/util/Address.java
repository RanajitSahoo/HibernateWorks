package com.jsp.util;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String village;
	private String street;
	private String district;
	private String city;
	private String state;
	private String nation;
	private int pin;

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String village, String street, String district, String city, String state, String nation, int pin) {
		super();
		this.village = village;
		this.street = street;
		this.district = district;
		this.city = city;
		this.state = state;
		this.nation = nation;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", street=" + street + ", district=" + district + ", city=" + city
				+ ", state=" + state + ", nation=" + nation + ", pin=" + pin + "]";
	}
}
