package com.titans.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.LoginInfo;
import com.titans.beans.Restaurant;
import com.titans.services.RestaurantService;

@RestController
@RequestMapping(value="/restaurant")
@CrossOrigin(origins="http://localhost:4200")
public class RestaurantController {
	private static final String USER = "loggedUser";
	@Autowired
	private RestaurantService rs;
	
	@RequestMapping(method=RequestMethod.GET)
	public LoginInfo login(HttpSession session) {
		return (LoginInfo) session.getAttribute("loggedUser");
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Restaurant saveTags(@RequestBody Restaurant r, HttpSession session) {
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		if(loggedUser.getCustomer() == null)
			if(loggedUser.getRestaurant() == null) {
				rs.updateRestaurant(r);
			}
		return r;
	}
	
}
