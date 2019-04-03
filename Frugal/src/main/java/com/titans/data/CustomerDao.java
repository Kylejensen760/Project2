package com.titans.data;

import java.util.List;

import com.titans.beans.Customer;

public interface CustomerDao {
	
	Customer login(String username, String password);
	Customer getEmployee(String username, String password);

	void saveCustomer(Customer c);
	void updateCustomer(Customer c);
	void deleteCustomer(Customer c);
	List<Customer> getCustomer();

}
