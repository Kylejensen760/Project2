package com.titans.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.titans.beans.Review;
import com.titans.data.ReviewDao;
import com.titans.services.ReviewService;
import com.titans.services.CustomerService;

@RestController
@RequestMapping(value="/review")
@CrossOrigin(origins="http://localhost:4200")
public class ReviewController {
	@Autowired
	private ReviewService rs;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Review> getAll() {
		System.out.println("this is the other get");
		return rs.getReviews();
	}
	
//	@RequestMapping(method=RequestMethod.POST)
//	public LoginInfo login(@RequestParam("user") String username, 
//			@RequestParam("pass") String password, HttpSession session) {
//		Customer c = cs.login(username,  password);
//		if(c==null) {
//			return null;
//		}
//		LoginInfo loggedUser = new LoginInfo(c);
//		session.setAttribute("loggedUser", loggedUser);
//		return loggedUser;
//	}

}
