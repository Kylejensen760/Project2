package com.titans.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	Session session;
	@Autowired
	private MenuItemService cs;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<MenuItem> getAll() throws JsonProcessingException, IOException {
		System.out.println("this is the other get");
		List<MenuItem> x = cs.getMenuItems();
		System.out.println(x);
		

		return x;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public MenuItem saveMenuItem(@RequestBody MenuItem mi, HttpSession session) {
		System.out.println(mi);
		cs.saveMenuItem(mi);
		return mi;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteMenuItem(@PathVariable("id") int id, @RequestBody MenuItem mi) {
		cs.deleteCustomer(mi);
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
