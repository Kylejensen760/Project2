//package com.titans.controllers;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.titans.beans.Menu;
//import com.titans.services.MenuService;
//import com.titans.services.RestaurantService;
//
//
//
//@RestController
//@RequestMapping(value="/menu")
//@CrossOrigin(origins="http://localhost:4200")
//public class MenuController {
//
//	@Autowired
//	private MenuService ms;
//	@Autowired
//	private RestaurantService rs;
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public List<Menu> menu(HttpSession session) {
//		return ms.getMenu();
//		//return null;
//		//return (Menu) session.getAttribute("loggedUser");
//	}
//	
//	@RequestMapping(method=RequestMethod.POST)
//	public String addMenu(@RequestParam("rid") int id, HttpSession session) {
//		Menu m = new Menu();
//	    m.setRestaurant(rs.getRestaurantById(id));
//		ms.addMenu(m);
//		return "Saved";
//}
//}