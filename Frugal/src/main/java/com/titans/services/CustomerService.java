package com.titans.services;

import java.util.List;

import com.titans.beans.Customer;
 
public interface CustomerService {
	public Customer login(String username, String password);
	public Customer getCustomerById(int i);
	public List<Customer> getCustomers();
	public Customer deleteCustomer(Customer cust);
	public Customer updateCustomer(Customer cust);
	public Customer saveCustomer(Customer cust);
	
}
