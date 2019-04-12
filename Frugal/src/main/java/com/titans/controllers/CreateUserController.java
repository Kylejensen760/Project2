package com.titans.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Customer;
import com.titans.beans.Restaurant;
import com.titans.beans.LoginInfo;
import com.titans.services.CustomerService;
import com.titans.data.CustomerDao;
import com.titans.data.CustomerHibernate;
//import com.titans.services.RestaurantService;

@RestController
@RequestMapping(value="/create")
@CrossOrigin(origins="http://localhost:4200")
public class CreateUserController {

	@Autowired
	private CustomerService cs;
	private CustomerHibernate ch;
	
	@RequestMapping(method=RequestMethod.GET)
	public LoginInfo login(HttpSession session) {
		System.out.println("This is Get");
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Customer customer(@RequestParam("first") String firstName, @RequestParam("last") String lastName, @RequestParam("user") String username, 
			@RequestParam("pass") String password, @RequestParam("phone") String phone, @RequestParam("email") String email, HttpSession session) {
		
		System.out.println("this is post");
		
		System.out.println(firstName + lastName + username + password + phone + email);
		Customer c = cs.saveCustomer(firstName, lastName, username, password, phone, email);
		
		if(c==null) {
			return null;
		}
		Customer customer = new Customer(c);
		session.setAttribute("created", customer);
		return customer;
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
