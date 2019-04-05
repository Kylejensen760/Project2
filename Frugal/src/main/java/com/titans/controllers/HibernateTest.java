package com.titans.controllers;

import javax.persistence.Column;

import org.hibernate.Session;

import com.titans.beans.Customer;
import com.titans.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        Customer cust = new Customer();
        
    	
	    cust.setFirstName("Karl");
	 	
	 	cust.setLastName("Cortez");	 	
	 	
	    cust.setUsername("zetroclrak");	 	
	 	
	    cust.setPassword("password");	 	
	 	
	    cust.setPhone("123-456-7890");	 	
	 	
	    cust.setEmail("test@test.gov");
	 	
	 	
         
        //Save the employee in database
        session.save(cust);
 
        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();

		
		
	}

}
