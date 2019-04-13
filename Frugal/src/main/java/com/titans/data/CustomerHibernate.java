package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
	public Customer deleteCustomer(Customer cust) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public Customer updateCustomer(Customer cust) {
		Session s = hu.getSession();
		Transaction tx = s.beginTransaction();
		s.update(cust);
		tx.commit();
		s.close();
		return cust;
	}

	public void newCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer saveCustomer(Customer c) {
		// TODO Auto-generated method stub

		System.out.println("save customer method in Customer Hibernate");
		Session s = hu.getSession();
		Transaction t = s.beginTransaction();

		s.save(c);
		t.commit();

		System.out.println("finished SaveCustomerHibernate");
		System.out.println(c);
		s.close();

		return c;
	}


	@Override
	public List<Customer> getAllCustomers() {

		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	
}

