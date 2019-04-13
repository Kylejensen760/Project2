package com.titans.data;

import java.util.List;
import java.util.Set;

import com.titans.beans.Restaurant;
import com.titans.beans.Tag;

public interface RestaurantDao {
	
	Restaurant login(String username, String password);
	
	Restaurant getRestaurant(String username); // ** we need to change this line 
	Restaurant getRestaurantById(int id);
	Restaurant saveRestaurant(Restaurant r);
	Restaurant updateRestaurant(Restaurant r);
	Restaurant deleteRestaurant(Restaurant r);
	public List<Restaurant> getRestaurants();
	public Set<Tag> getRestaurantTags();
	public void setRestaurantTags(Set<Tag> tags);
}
