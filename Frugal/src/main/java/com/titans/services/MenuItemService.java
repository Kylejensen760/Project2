package com.titans.services;

import java.util.List;

import com.titans.beans.MenuItem;

public interface MenuItemService {

		public MenuItem getMenuItemById(Long id);
		public List<MenuItem> getMenuItems();
		MenuItem saveMenuItem(MenuItem mi);
		public void deleteMenuItem(MenuItem mi);
		MenuItem updateMenuItem(MenuItem mi);
//		public void newCustomer(Customer cust);
		
	}


