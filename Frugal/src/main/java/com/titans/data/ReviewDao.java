package com.titans.data;

import java.util.List;

import com.titans.beans.Review;

public interface ReviewDao {
	
	Review getReview(String s); //**we need to change this line and add stuff

	Review saveReview(Review r);
	void updateReview(Review r);
	void deleteReview(Review r);
	List<Review> getAll();

}

