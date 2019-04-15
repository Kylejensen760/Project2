package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.util.HibernateUtil;
import com.titans.beans.Review;

@Component 
public class ReviewHibernate implements ReviewDao{
	@Autowired
	private HibernateUtil hu;
	
	public List<Review> getAll() {
		Session s = hu.getSession();
		List<Review> b = s.createQuery("From com.titans.beans.Review", Review.class).list();
		System.out.println(b);
		s.close();
		return b;
	}

	@Override
	public Review getReview(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review saveReview(Review r) {
		return r;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReview(Review r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteReview(Review r) {
		// TODO Auto-generated method stub
		
	}
}
