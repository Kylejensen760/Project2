package com.titans.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import com.titans.beans.Customer;
import com.titans.services.CustomerService;

@Controller
//@RequestMapping(value="/login")
public class LoginController {
	@Autowired
	private CustomerService cs;
	
//	@RequestMapping(method=RequestMethod.GET)
	public String goLogin(HttpSession session) {
		if(session.getAttribute("user")!=null)
			return "redirect:home";
		return "static/login.html";
	}
//	@RequestMapping(method=RequestMethod.POST)
	public String login(HttpSession session, String username,  String password) {
		Customer c = cs.login(username, password);
		System.out.println(username);
		System.out.println(password);
		if(c != null) {
			session.setAttribute("user", c);

			return "redirect:home";
		}
		return "redirect:login";
	}
	
}
