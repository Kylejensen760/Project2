package com.titans.services;

import java.util.List;
import java.util.Set;

import com.titans.beans.Restaurant;
import com.titans.beans.Tag;

public interface RestaurantService {
	public Restaurant login(String username, String password);
	public Restaurant getRestaurant(String username);
	public Restaurant getRestaurantById(int i);
	public List<Restaurant> getRestaurants();
	public void deleteRestaurant(Restaurant rest);
	public Restaurant updateRestaurant(Restaurant rest);
	public Restaurant newRestaurant(Restaurant rest);
	public Set<Tag> getRestaurantTags();
	public void setRestaurantTags(Set<Tag> tags);
}
