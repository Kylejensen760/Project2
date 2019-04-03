package com.titans.beans;

import java.io.Serializable;

@Entity
public class Tag implements Serializable {
	//add an annotation because The bean is named differently from the database table
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tag_id")
	private int tagId;
	
	@Column(name = "restaurant_id")
	private int restaurantId;

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + restaurantId;
		result = prime * result + tagId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (restaurantId != other.restaurantId)
			return false;
		if (tagId != other.tagId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tag [tagId=" + tagId + ", restaurantId=" + restaurantId + "]";
	}

	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tag(int tagId, int restaurantId) {
		super();
		this.tagId = tagId;
		this.restaurantId = restaurantId;
	}
	
	 

	
}
