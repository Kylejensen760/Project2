package com.titans.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Menu;
import com.titans.services.MenuService;



@RestController
@RequestMapping(value="/menu")
@CrossOrigin(origins="http://localhost:4200")
public class MenuController {

	@Autowired
	private MenuService ms;	
	
	@RequestMapping(method=RequestMethod.GET)
	public Menu menu(HttpSession session) {
		return null;
		//return (Menu) session.getAttribute("loggedUser");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addMenu(@RequestParam("rid") Long id, HttpSession session) {
		Menu m = new Menu();
	    m.setRestaurantId(id);
	    m.setId(id);
	    m.setBegginingTime(id);
	    m.setEndTime(id);
		ms.addMenu(m);
		return "Saved";
}
}