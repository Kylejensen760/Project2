package com.titans.data;

import java.util.List;

import com.titans.beans.Review;

public interface ReviewDao {
	
	Review getReview(String s);

	void saveReview(Review c);
	void updateReview(Review c);
	void deleteReview(Review c);
	List<Review> getReview();

}