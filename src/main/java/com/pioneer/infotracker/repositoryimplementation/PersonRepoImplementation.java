package com.pioneer.infotracker.repositoryimplementation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pioneer.infotracker.domain.Person;
import com.pioneer.infotracker.repository.PersonRepo;

@Repository
public class PersonRepoImplementation implements PersonRepo{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Person person) {
		
		Session sess = sessionFactory.getCurrentSession();
		sess.persist(person);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAll() {
		Session session = sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

	@Override
	public Person searchByEmail(String email) {
		Session sess = sessionFactory.getCurrentSession();
		Criteria ctr = sess.createCriteria(Person.class);
        ctr.add(Restrictions.eq("email",email));
        return (Person) ctr.uniqueResult();
	}
	
}
