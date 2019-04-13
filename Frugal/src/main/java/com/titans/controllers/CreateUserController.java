package com.titans.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Customer;
import com.titans.beans.LoginInfo;
import com.titans.services.CustomerService;
//import com.titans.services.RestaurantService;

@RestController
@RequestMapping(value="/create")
@CrossOrigin(origins="http://localhost:4200")
public class CreateUserController {

	@Autowired
	private CustomerService cs;
	
	@RequestMapping(method=RequestMethod.GET)
	public LoginInfo login(HttpSession session) {
		System.out.println("This is Get");
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Customer customer(@RequestBody Customer c, HttpSession session) {
		
		System.out.println("this is post");
		System.out.println(c);		
		if(c==null) {
			return null;
		}
		cs.saveCustomer(c);
		session.setAttribute("created", c);
		return c;
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
