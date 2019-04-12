package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.util.HibernateUtil;
import com.titans.beans.MenuItem;

@Component 
public class MenuItemHibernate implements MenuItemDao{
	@Autowired
	private HibernateUtil hu;
	
	public List<MenuItem> getAll() {
		Session s = hu.getSession();
		List<MenuItem> b = s.createQuery("From com.titans.beans.MenuItem", MenuItem.class).list();
		System.out.println(b);
		s.close();
		return b;
	}

	@Override
	public MenuItem getMenuItem(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMenuItem(MenuItem mi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMenuItem(MenuItem mi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMenuItem(MenuItem mi) {
		// TODO Auto-generated method stub
		
	}
}
