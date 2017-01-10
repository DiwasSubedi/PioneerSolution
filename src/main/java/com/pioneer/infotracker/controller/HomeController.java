package com.pioneer.infotracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
		public String personform(){
			  return "login";
		 }
	 
		@RequestMapping(value = "/failed")
		public String failed(Model model) {
			model.addAttribute("error", "true");
			return "login";
		}
		@RequestMapping(value = "/logout")
		public String logout(Model model) {
			model.addAttribute("out", "true");
			return "login";
		}
		@RequestMapping(value = "/403")
		public String error(Model model) {
			model.addAttribute("out", "true");
			return "error";
		}
		@RequestMapping(value = "/home")
		public String home(Model model) {			
			return "home";
		}
}
