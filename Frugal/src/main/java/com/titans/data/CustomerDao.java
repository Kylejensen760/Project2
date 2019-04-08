package com.titans.data;

import java.util.List;

import com.titans.beans.Customer;

public interface CustomerDao {
	
	Customer login(String username, String password);

	Customer saveCustomer(String firstName, String lastName, String username, String password, String phone, String email);
	Customer updateCustomer(Customer c);
	void deleteCustomer(Customer c);
	List<Customer> getAllCustomers();

}
