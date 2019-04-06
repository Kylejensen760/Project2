package com.titans.controllers;

import javax.persistence.Column;

import org.hibernate.Session;

import com.titans.beans.Customer;
import com.titans.util.HibernateUtil;
import com.titans.data.CustomerDao;
import com.titans.data.CustomerHibernate;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
        //Add new Employee object
        Customer cust = new Customer();
        CustomerDao ch = new CustomerHibernate();
    	
	    cust.setFirstName("Karl");
	 	
	 	cust.setLastName("Cortez");	 	
	 	
	    cust.setUsername("zetroclrak");	 	
	 	
	    cust.setPassword("password");	 	
	 	
	    cust.setPhone("123-456-7890");	 	
	 	
	    cust.setEmail("test@test.gov");
	 	
	 	
       System.out.println(cust);
       ch.saveCustomer(cust);

		System.out.println("done");
		
	}

}
