package com.pioneer.infotracker.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pioneer.infotracker.domain.Address;
import com.pioneer.infotracker.domain.Credentials;
import com.pioneer.infotracker.domain.Person;
import com.pioneer.infotracker.service.PersonService;

@Controller
public class UserController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value="/students",method=RequestMethod.POST)
	@ResponseBody
	public Person saveStudent(@RequestBody Person person){
		//Person p = personService.save(person);
		return person;
	}
	
	
	@RequestMapping(value="/newPerson",method=RequestMethod.GET)
	@ResponseBody
	public Person giveNewStudent(){
		Person p = new Person();
		Address a =new Address();
		List<Address> list = new ArrayList<Address>();
		list.add(a);
		Credentials c =new Credentials();
		p.setCredentials(c);
		p.setAddress(list);
		return p;
	}

}
