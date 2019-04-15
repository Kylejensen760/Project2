package com.titans.data;

import java.util.List;

import com.titans.beans.MenuItem;

public interface MenuItemDao {
	
	MenuItem getMenuItem(String s); //**we need to change this line and add stuff

	MenuItem saveMenuItem(MenuItem mi);
	void updateMenuItem(MenuItem mi);
	void deleteMenuItem(MenuItem mi);
	List<MenuItem> getAll();

}

