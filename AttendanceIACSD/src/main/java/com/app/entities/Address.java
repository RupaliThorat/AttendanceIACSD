package com.app.entities;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue
	@Column(name="address_id")
	private int addid;

	@Column(length=100)
	private String street;

	@Column(name="city")
	private String city;
	@Column(name="pincode")
	private String pincode;
	@Column(name="state")
	private String state;
	
	
	
	public Address(int addid, String street, String city, String pincode, String state) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + ", pincode=" + pincode + ", state="
				+ state + "]";
	}
}
		
		