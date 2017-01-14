package com.pioneer.infotracker.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.pioneer.infotracker.domain.Person;
import com.pioneer.infotracker.service.PersonService;



@Controller
@SessionAttributes("loggedInUser")
public class HomeController {
	
	@Autowired
	PersonService personservice;	
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
		public String personform(){
			  return "login";
		 }
	 
		@RequestMapping(value = "/failed",method = RequestMethod.GET)
		public String failed(Model model) {
			model.addAttribute("error", "true");
			return "login";
		}
		
		@RequestMapping(value = "/logout")
		public String logout(Model model,SessionStatus status,HttpSession session) {
			status.setComplete();
			session.removeAttribute("loggedInUser");       
	 		return "home";
		}
		@RequestMapping(value = "/403",method = RequestMethod.GET)
		public String error(Model model) {
			model.addAttribute("out", "true");
			return "error";
		}
		@RequestMapping(value = "/")
		public String home(Model model) {

			try{
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String username;
			if (principal instanceof UserDetails) {
			  username = ((UserDetails)principal).getUsername();
			} 
			else {
			  username = principal.toString();
			}
			System.out.println(username +"  in home");
			Person person = personservice.searchByEmail(username);
			if(person !=null){
			model.addAttribute("loggedInUser", person);
			}
			}
			catch(NullPointerException e){
				System.out.println("Not loggedin");
				//model.addAttribute("loggedInUser",null);
			}			
			return "home";
		}
		/*	
		@RequestMapping(value = "/postLogin")
		public String returnHome(Model model) {			
			return "home";
		}*/
		
}
