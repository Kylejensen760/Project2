package com.titans.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Customer;
import com.titans.beans.Restaurant;
import com.titans.beans.LoginInfo;
import com.titans.services.CustomerService;
import com.titans.services.RestaurantService;\

@RestController
@RequestMapping(value="/login")
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {

	@Autowired
	private CustomerService cs;
	@Autowired
	private RestaurantService rs;
	
	@RequestMapping(method=RequestMethod.GET)
	public LoginInfo login(HttpSession session) {
		return (LoginInfo) session.getAttribute("loggedUser");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public LoginInfo login(@RequestParam("user") String username, 
			@RequestParam("pass") String password, HttpSession session) {
		Customer c = cs.login(username,  password);
		Restaurant r = rs.login(username, password);
		if(c==null&&r==null) {
			return null;
		}
		LoginInfo loggedUser = new LoginInfo(c,r);
		session.setAttribute("loggedUser", loggedUser);
		return loggedUser;
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout(HttpSession session) {
		session.invalidate();
	}
}

