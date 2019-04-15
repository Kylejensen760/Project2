package com.titans.controllers;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titans.beans.Tag;
import com.titans.services.TagService;

@RestController
@RequestMapping(value="/tag")
@CrossOrigin(origins="http://localhost:4200")
public class TagController {
	@Autowired
	private TagService ts;
	
	@RequestMapping(method=RequestMethod.GET)
	public Set<Tag> login(HttpSession session) {
		return ts.getAllTags();
	}
}
