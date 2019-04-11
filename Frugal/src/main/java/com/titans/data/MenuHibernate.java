package com.titans.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.beans.Menu;
import com.titans.util.HibernateUtil;

@Component
public class MenuHibernate implements MenuDao {
	
	@Autowired
	private HibernateUtil hu;
	
	@Override
	public Menu getMenu(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu addMenu(Menu m) {
		Session s = hu.getSession();
		Transaction t = s.beginTransaction();
		s.save(m);
		t.commit();
		s.close();
		return m;
	}

	@Override
	public Menu saveMenu(Menu m) {
		return m;
	}

	@Override
	public void updateMenu(Menu m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMenu(Menu m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menu> getMenu() {
		System.out.println(hu);
		Session s = hu.getSession();
		List<Menu> temp = (List<Menu>) s.createQuery("From com.titans.beans.Menu", Menu.class).list();
		s.close();
		return temp;
	}

}
