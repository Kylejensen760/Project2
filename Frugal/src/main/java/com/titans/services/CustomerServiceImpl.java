package com.titans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.beans.Customer;
import com.titans.data.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao cd;
	
	@Override
	public Customer login(String username, String password) {
		return cd.login(username, password);
	}

	@Override
	public Customer getCustomerById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	

}
