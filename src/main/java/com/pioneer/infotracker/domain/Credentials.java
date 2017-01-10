package com.pioneer.infotracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Credentials {

	@Id
	private Long id;

	@NotEmpty
	@Lob
	@Column(name = "password", length = 5000)
	private String password;

	boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	private Integer role;

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public Integer getRole() {
		return role;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}
