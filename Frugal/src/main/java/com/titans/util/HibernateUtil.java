package com.titans.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sf=
			new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
}
