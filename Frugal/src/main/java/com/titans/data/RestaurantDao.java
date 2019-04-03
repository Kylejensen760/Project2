package com.titans.data;

import java.util.List;

import com.titans.beans.Restaurant;

public interface RestaurantDao {
	
	Restaurant getRestaurant(String s); // ** we need to change this line 

	void saveRestaurant(Restaurant m);
	void updateRestaurantu(Restaurant m);
	void deleteRestaurant(Restaurant m);
	List<Restaurant> getRestaurant();

}
