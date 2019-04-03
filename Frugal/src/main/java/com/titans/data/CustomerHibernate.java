package com.titans.data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.titans.beans.Customer;
import com.titans.util.HibernateUtil;
public class CustomerHibernate implements CustomerDao {
	private static HibernateUtil hu = HibernateUtil.getInstance();
	@Override
	public Customer login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer saveCustomer(Customer c) {
		Session s = hu.getSession();
		Transaction tx = s.beginTransaction();
		s.save(c);
		tx.commit();
		s.close();
		return c;
	}

	@Override
	public Customer updateCustomer(Customer c) {
		
		Session s = hu.getSession();
		Transaction tx = s.beginTransaction();
		s.update(c);
		tx.commit();
		s.close();
		return c;
	}

	@Override
	public void deleteCustomer(Customer c) {
		Session s = hu.getSession();
		Transaction tx = s.beginTransaction();
		s.delete(c);
		tx.commit();
		s.close();
		
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
