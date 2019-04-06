package com.titans.services;

import java.util.List;

import com.titans.beans.Customer;
 
public interface CustomerService {
	public Customer login(String username, String password);
	public Customer getCustomerById(int i);
	public List<Customer> getCustomers();
	public void deleteCustomer(Customer cust);
	public void updateCustomer(Customer cust);
	public void newCustomer(Customer cust);
}
