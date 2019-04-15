package com.titans.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Customer;
import com.titans.beans.LoginInfo;
import com.titans.beans.MenuItem;
import com.titans.beans.Restaurant;
import com.titans.services.RestaurantService;
import com.titans.beans.Review;
import com.titans.data.ReviewDao;
import com.titans.services.ReviewService;

@RestController
@RequestMapping(value="/restaurant")
@CrossOrigin(origins="http://localhost:4200")
public class RestaurantController {
	private static final String USER = "loggedUser";
	@Autowired
	private RestaurantService rs;
	
	@Autowired
	private ReviewService res;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Restaurant> getRestaurants() {
		System.out.println("this is get for restaurants");
		return rs.getRestaurants();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Restaurant createAccount(@RequestBody Restaurant r, HttpSession session) {
		List<Restaurant> restaurants = rs.getRestaurants();
		for(Restaurant rest : restaurants) {
			if(rest.getName().equals(r.getName())) {
				return null;
			}
		}
		rs.newRestaurant(r);
		return r;
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
