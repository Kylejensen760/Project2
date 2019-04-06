package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.titans.beans.Customer;

@Component
public class CustomerHibernate implements CustomerDao {
	
	private Session s;
	
	public void setSession(Session s) {
		this.s = s;
	}
	
	@Override
	public Customer login(String username, String password) {
		for(Customer c : getAllCustomers()) {
			if(c.getUsername().equals(username) && c.getPassword().equals(password))
				return c;
		}
		return null;
	}

	@Override
	public Customer saveCustomer(Customer c) {
		s.save(c);
		return c;
	}

	@Override
	public Customer updateCustomer(Customer c) {
		s.update(c);
		return c;
	}

	@Override
	public void deleteCustomer(Customer c) {
		s.delete(c);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) s.createQuery("From com.titans.beans.Customer", Customer.class).list();
	}

	
	
	
}
