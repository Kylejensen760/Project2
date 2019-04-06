package com.titans.data;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.titans.services.CustomerService;
import com.titans.beans.Customer;
import com.titans.util.HibernateUtil;

@Service
public class CustomerHibernate implements CustomerService {
//	@Autowired
//	private CustomerDao cd;
	
	private static HibernateUtil hu = new HibernateUtil();
    private Session s;
	
	public void setSession(Session s) {
		this.s = s;
	}
	
	@Override
	public Customer login(String username, String password) {
		for(Customer c : getCustomers()) {
			if(c.getUsername().equals(username) && c.getPassword().equals(password))
				return c;
		}
		return null;
	}

	@Override
	public Customer getCustomerById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) s.createQuery("From com.titans.beans.Customer", Customer.class).list();
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

