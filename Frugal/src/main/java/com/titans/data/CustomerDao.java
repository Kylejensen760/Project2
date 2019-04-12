package com.titans.data;

import java.util.List;

import com.titans.beans.Customer;

public interface CustomerDao {
	
	Customer login(String username, String password);

	Customer saveCustomer(Customer c);
	Customer updateCustomer(Customer c);
	void deleteCustomer(Customer c);
	List<Customer> getAllCustomers();

}
