package com.titans.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.titans.beans.Review;
import com.titans.data.ReviewDao;
import com.titans.services.ReviewService;


@RestController
@RequestMapping(value="/review")
@CrossOrigin(origins="http://localhost:4200")
public class ReviewController {
	@Autowired
	private ReviewService res;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Review> getAll() {
		System.out.println("this is the other get");
		return res.getReviews();
	}
	
		@RequestMapping(method=RequestMethod.POST)
	public Review review(@RequestBody Review re, HttpSession session) {

		System.out.println("this is post");
		System.out.println(re);		
		if(re==null) {
			return null;
		}
		res.saveReview(re);
		session.setAttribute("created", re);
		return re;
	}

}
