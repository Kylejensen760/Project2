package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
	public MenuItem saveMenuItem(MenuItem mi) {
		Session s = hu.getSession();
		Transaction t = s.beginTransaction();
		s.save(mi);
		t.commit();
		s.close();
		return mi;
	}

	@Override
	public MenuItem updateMenuItem(MenuItem mi) {
		Session s = hu.getSession();
		Transaction t = s.beginTransaction();
		s.update(mi);
		t.commit();
		s.close();
		return mi;
	}

	@Override
	public void deleteMenuItem(MenuItem mi) {
		Session s = hu.getSession();
		Transaction t = s.beginTransaction();
		s.delete(mi);
		t.commit();
		s.close();
	}

	@Override
	public MenuItem getMenuItemById(Long id) {
		Session s = hu.getSession();
		MenuItem mi = s.get(MenuItem.class, id);
		s.close();
		return mi;
	}
}
