package com.pioneer.infotracker.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pioneer.infotracker.domain.Person;
import com.pioneer.infotracker.repository.PersonRepo;
import com.pioneer.infotracker.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepo personrepo;
	
	@Override
	public Person save(Person person) {
		return personrepo.save(person);
		
	}

	@Override
	public List<Person> getAll() {
		return personrepo.getAll();
	}

	@Override
	public Person searchByEmail(String email) {
		return personrepo.searchByEmail(email);
	}

}
