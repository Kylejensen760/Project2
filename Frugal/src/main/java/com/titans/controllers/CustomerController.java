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

@RestController
@RequestMapping(value="/customer")
@CrossOrigin(origins="http://localhost:4200")
public class CustomerController {
	
	private static final String USER = "loggedUser";
	@Autowired
	private CustomerService cs;
	
	@RequestMapping(method=RequestMethod.PUT)
	public Customer saveTags(@RequestBody Customer c, HttpSession session) {
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		if(loggedUser.getCustomer() != null) {
			loggedUser.setCustomer(c);
			cs.updateCustomer(c);
		}
		return c;
	}
}
