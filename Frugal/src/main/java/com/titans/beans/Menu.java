package com.titans.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	@Column(name = "restaurant_id")
	private Long restaurantId;
	
	@Column(name = "time_begin")
	private Long begginingTime;
	
	@Column(name = "time_end")
	private Long endTime;

	
	
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Menu(Long restuarantId) {
		super();
		this.restaurantId = restuarantId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((begginingTime == null) ? 0 : begginingTime.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((restaurantId == null) ? 0 : restaurantId.hashCode());
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
		Menu other = (Menu) obj;
		if (begginingTime == null) {
			if (other.begginingTime != null)
				return false;
		} else if (!begginingTime.equals(other.begginingTime))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (restaurantId == null) {
			if (other.restaurantId != null)
				return false;
		} else if (!restaurantId.equals(other.restaurantId))
			return false;
		return true;
	}



	public Menu(Long id, Long restaurantId, Long begginingTime, Long endTime) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.begginingTime = begginingTime;
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", restaurantId=" + restaurantId + ", begginingTime=" + begginingTime + ", endTime="
				+ endTime + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Long getBegginingTime() {
		return begginingTime;
	}

	public void setBegginingTime(Long begginingTime) {
		this.begginingTime = begginingTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	
	
}

