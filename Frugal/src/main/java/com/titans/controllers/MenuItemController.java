package com.titans.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Customer;
import com.titans.beans.LoginInfo;
import com.titans.beans.MenuItem;
import com.titans.data.MenuItemDao;
import com.titans.services.MenuItemService;
import com.titans.services.CustomerService;

@RestController
@RequestMapping(value="/menuItem")
@CrossOrigin(origins="http://localhost:4200")
public class MenuItemController {
	@Autowired
	private MenuItemService cs;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<MenuItem> getAll() {
		System.out.println("this is the other get");
		return cs.getMenuItems();
	}
	
//	@RequestMapping(method=RequestMethod.POST)
//	public LoginInfo login(@RequestParam("user") String username, 
//			@RequestParam("pass") String password, HttpSession session) {
//		Customer c = cs.login(username,  password);
//		if(c==null) {
//			return null;
//		}
//		LoginInfo loggedUser = new LoginInfo(c);
//		session.setAttribute("loggedUser", loggedUser);
//		return loggedUser;
//	}

}