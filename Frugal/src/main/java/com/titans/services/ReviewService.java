package com.titans.services;

import java.util.List;

import com.titans.beans.Review;

public interface ReviewService {

		//public MenuItem getMenuItem(String itemName);
		public List<Review> getReviews();

		public Review saveReview(Review re);
		
		

}