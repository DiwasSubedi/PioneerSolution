package com.pioneer.infotracker.repository;

import java.util.List;

import com.pioneer.infotracker.domain.Person;

public interface PersonRepo {
	
	public Person save(Person person);
	public List<Person> getAll();
	public Person searchByEmail(String email);

}
