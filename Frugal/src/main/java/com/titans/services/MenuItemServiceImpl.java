package com.titans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.beans.MenuItem;
import com.titans.data.MenuItemDao;

@Service 
public class MenuItemServiceImpl implements MenuItemService{
	@Autowired
	private MenuItemDao mid;
	

//	public MenuItem getMenuItem(String itemName) {
//		return mid.getMenuItem(s);
//	}


	public List<MenuItem> getMenuItems() {
		return mid.getAll();

	}


	@Override
	public MenuItem saveMenuItem(MenuItem mi) {
		return mid.saveMenuItem(mi);
	}

//	@Override
//	public void deleteCustomer(Customer cust) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateCustomer(Customer cust) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void newCustomer(Customer cust) {
//		// TODO Auto-generated method stub
//		
//	}
}
