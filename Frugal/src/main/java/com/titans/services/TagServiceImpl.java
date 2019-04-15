package com.titans.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.beans.Tag;
import com.titans.data.TagDao;

@Service
public class TagServiceImpl implements TagService{

	@Autowired
	private TagDao td;
	
	@Override
	public Set<Tag> getAllTags() {
		return td.getAllTags();
	}

}
