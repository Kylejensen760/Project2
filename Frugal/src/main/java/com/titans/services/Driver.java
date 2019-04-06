package com.titans.services;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.titans.util.HibernateUtil;
import com.titans.beans.MenuItem;
import com.titans.data.CustomerDao;

public class Driver {
	private static HibernateUtil hu = HibernateUtil.getInstance();

	private static ApplicationContext ac;
	public static void main(String[] args) {
		
		
	}
	public static void firstRetrieval(int id) {
		// open a session to the database
		Session su = hu.getSession();
		// retrieve a honeypot from the db;
		MenuItem h = su.get(MenuItem.class, id);
		System.out.println(h);
		
		// close the session
		su.close();
		System.exit(0);

	}
}
