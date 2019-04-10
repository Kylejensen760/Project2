package com.titans.services;

import java.util.Set;

import com.titans.beans.Restaurant;
import com.titans.beans.Tag;

public interface RestaurantService {
	public Restaurant login(String username, String password);
	public Restaurant getRestaurantById(int i);
	public Set<Restaurant> getRestaurant();
	public void deleteRestaurant(Restaurant cust);
	public void updateRestaurant(Restaurant cust);
	public void newRestaurant(Restaurant cust);
	public Set<Tag> getRestaurantTags();
	public void setRestaurantTags(Set<Tag> tags);
}
