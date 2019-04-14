package com.titans.data;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.beans.Customer;
import com.titans.beans.Restaurant;
import com.titans.beans.Tag;
import com.titans.util.HibernateUtil;

@Component
public class RestaurantHibernate implements RestaurantDao{

	@Autowired
	private HibernateUtil hu;
	
	@Override
	public Restaurant login(String username, String password) {
		List<Restaurant> lr = getRestaurants();
		for(Restaurant r : lr) {
			if(r.getUsername().equals(username) && r.getPassword().equals(password))
				return r;
		}
		return null;
	}

	@Override
	public Restaurant getRestaurant(String username) {
		List<Restaurant> lr = getRestaurants();
		for(Restaurant r : lr) {
			if(r.getUsername().equals(username))
				return r;
		}
		return null;
	}
	
	@Override
	public Restaurant getRestaurantById(int id) {
		return null;
		//TODO
	}

	@Override
	public Restaurant saveRestaurant(Restaurant r) {
		Session s = hu.getSession();
		Transaction t = s.beginTransaction();
		s.save(r);
		t.commit();
		s.close();
		return r;
	}
	
	@Override
	public Restaurant updateRestaurant(Restaurant r) {
		return null;
		//TODO
	}

	@Override
	public Restaurant deleteRestaurant(Restaurant r) {
		//TODO
		return null;
	}

	@Override
	public List<Restaurant> getRestaurants() {
		Session s = hu.getSession();
		List<Restaurant> temp = (List<Restaurant>) s.createQuery("From com.titans.beans.Restaurant", Restaurant.class).list();
		s.close();
		return temp;
	}

	@Override
	public Set<Tag> getRestaurantTags() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setRestaurantTags(Set<Tag> tags) {
		// TODO Auto-generated method stub
	}

}
