package com.pioneer.infotracker.domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author David
 *This  is a address class used to store the address of the user it implements general setter getter.
 */
@Entity
public class Address {
	
	private String addressType;
	
	
	@Size(min=2, max=50)
	public String city;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;	


	
	@Size(min=2, max=50)
	public String state;
	
	@Size(min=2, max=30)
	public String street;
	
	
	@Min(10000)
	@Max(99999)
	public int zip;
	
	
	
	public String getAddressType() {
		return addressType;
	}
	public String getCity() {
		return city;
	}
	
	public int getId() {
		return id;
	}
	public String getState() {
		return state;
	}
	public String getStreet() {
		return street;
	}
	public int getZip() {
		return zip;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public void setState(String state) {
		this.state = state;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

}
