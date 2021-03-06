package com.titans.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.beans.Restaurant;
import com.titans.beans.Tag;
import com.titans.data.RestaurantDao;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantDao rd;

	@Override
	public Restaurant login(String username, String password) {
		return rd.login(username, password);
	}

	@Override
	public Restaurant getRestaurantById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurants() {
		return rd.getRestaurants();
	}

	@Override
	public void deleteRestaurant(Restaurant rest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Restaurant updateRestaurant(Restaurant rest) {
		return rd.updateRestaurant(rest);
	}

	@Override
	public Restaurant newRestaurant(Restaurant rest) {
		return rd.saveRestaurant(rest);
	}

	@Override
	public Set<Tag> getRestaurantTags() {
		return rd.getRestaurantTags();
	}

	@Override
	public void setRestaurantTags(Set<Tag> tags) {
		rd.setRestaurantTags(tags);
	}

	@Override
	public Restaurant getRestaurant(String username) {
		return rd.getRestaurant(username);
	}
	
	
}
