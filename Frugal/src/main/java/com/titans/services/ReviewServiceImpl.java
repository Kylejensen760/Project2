package com.titans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.beans.Customer;
import com.titans.beans.Review;
import com.titans.data.CustomerDao;
import com.titans.data.ReviewDao;

@Service 
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewDao rd;
	

//	public MenuItem getMenuItem(String itemName) {
//		return mid.getMenuItem(s);
//	}


	public List<Review> getReviews() {
		return rd.getAll();

	}




//	@Override
//	public void deleteCustomer(Customer cust) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateCustomer(Customer cust) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void newCustomer(Customer cust) {
//		// TODO Auto-generated method stub
//		
//	}
}
