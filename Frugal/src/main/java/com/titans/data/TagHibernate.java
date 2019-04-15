package com.titans.data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.beans.Tag;
import com.titans.util.HibernateUtil;

@Component
public class TagHibernate implements TagDao{
	
	@Autowired
	private HibernateUtil hu;

	@Override
	public Tag getTag(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tag> getAllTags() {
		Session s = hu.getSession();
		String query = "from com.titans.beans.Tag";
		Query<Tag> q = s.createQuery(query, Tag.class);
		List<Tag> tagList = q.getResultList();
		s.close();
		return new HashSet<Tag>(tagList);
	}

}
