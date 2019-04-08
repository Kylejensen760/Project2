package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.beans.Customer;
import com.titans.util.HibernateUtil;

@Component
public class CustomerHibernate implements CustomerDao {
	
	@Autowired
	private HibernateUtil hu;
	
	@Override
	public Customer login(String username, String password) {
		List<Customer> lc = getCustomers();
		for(Customer c : lc) {
			if(c.getUsername().equals(username) && c.getPassword().equals(password))
				return c;
		}
		return null;
	}

	public Customer getCustomerById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getCustomers() {
		System.out.println(hu);
		Session s = hu.getSession();
		List<Customer> temp = (List<Customer>) s.createQuery("From com.titans.beans.Customer", Customer.class).list();
		s.close();
		return temp;
	}

	@Override
	public void deleteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	public Customer updateCustomer(Customer cust) {
		return cust;
		// TODO Auto-generated method stub
		
	}

	public void newCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer saveCustomer(String firstName, String lastName, String username, String password, String phone, String email) {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	
}

