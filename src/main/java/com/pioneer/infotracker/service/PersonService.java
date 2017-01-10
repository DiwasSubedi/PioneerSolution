package com.pioneer.infotracker.service;

import java.util.List;

import com.pioneer.infotracker.domain.Person;

public interface PersonService {

	public void save(Person p);
	public List<Person> getAll();
	public Person searchByEmail(String email);
}
