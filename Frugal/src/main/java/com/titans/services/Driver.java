package com.titans.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.titans.data.CustomerDao;

public class Driver {
	private static ApplicationContext ac;
	public static void main(String[] args) {
		ac = new ClassPathXmlApplicationContext("beans.xml");
		
		CustomerDao cd = (CustomerDao) ac.getBean(CustomerDao.class);
		System.out.println(cd.getAllCustomers());
		System.exit(0);
		
	}
}
