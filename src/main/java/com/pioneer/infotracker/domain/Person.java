package com.pioneer.infotracker.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




/**
 * @author David
 * This is a Person Class main class to store General information about a person.
 * This is included in most of the class related to person.
 *
 */
@Entity
public class Person {
	
	@Valid
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "userIdFk")
    private List<Address> address;

	@NotEmpty
	private Integer age;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	@Size(min = 2, max = 50)
	private String fName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty
	@Size(min = 2, max = 50)
	private String lName;
	
	@Valid
	@OneToOne
	private Credentials credentials;
	
	
	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public List<Address> getAddress() {
		return address;
	}

	public Integer getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getfName() {
		return fName;
	}

	public Integer getId() {
		return id;
	}

	public String getlName() {
		return lName;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	
	
	
	

}
