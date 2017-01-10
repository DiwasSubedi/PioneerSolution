package com.pioneer.infotracker.security;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.jdbc.Connection;
import com.pioneer.infotracker.domain.Person;
import com.pioneer.infotracker.service.PersonService;

@Component
@Transactional
public class DomainToSecurityUserMapping extends org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl {
	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { 
	 * // TODO Auto-generated method stub return
	 * null; }
	 */
	
	@Autowired
	PersonService personService;

	@Autowired
	public void setDs(DataSource dataSource) {
		
			if(dataSource!= null){
				setDataSource(dataSource);
			}
			else
				System.out.println("Datasource is null");
			 
	  }

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {		
		Person person = personService.searchByEmail(email);
		if(person == null){			
			throw new UsernameNotFoundException("The Person with this username is not found " +email);
		}
		User usr = new User(person.getEmail(), person.getCredentials().getPassword(),
				person.getCredentials().isEnabled(), true, true, true,
				getAuthorities(person.getCredentials().getRole()));
		return this.createUserDetails(email, usr, getAuthorities(person.getCredentials().getRole()));

	}

	public List<GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}

	public List<String> getRoles(Integer role) {
		List<String> roles = new ArrayList<String>();

		if (role.intValue() == 1) {
			roles.add("ROLE_STUDENT");
		} 
		else if (role.intValue() == 2) {
			roles.add("ROLE_MANAGEMENT");
		}
		return roles;
	}

	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

}
