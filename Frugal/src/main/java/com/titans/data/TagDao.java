package com.titans.data;

import java.util.List;

import com.titans.beans.Tag;

public interface TagDao {
	
	Tag getTag(String s);

	void saveTag(Tag t);
	void updateTag(Tag t);
	void deleteTag(Tag t);
	List<Tag> getTag();

}
