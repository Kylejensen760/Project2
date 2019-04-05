package com.titans.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.titans.data.CustomerDao;
import com.titans.data.CustomerHibernate;

public class Driver {
	private static ApplicationContext ac;
	public static void main(String[] args) {
		
		CustomerDao cd = new CustomerHibernate();
		System.out.println(cd.getAllCustomers());
		
	}
}
