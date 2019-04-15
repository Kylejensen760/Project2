package com.titans.data;

import java.util.Set;

import com.titans.beans.Tag;

public interface TagDao {
	
	Tag getTag(String s);
	Set<Tag> getAllTags();

}
