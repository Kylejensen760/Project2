//package com.titans.beans;
//
//import java.io.Serializable;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "menu")
//public class Menu {
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//
//    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "restaurant_id")
//    private Restaurant restaurant;
//
//    @Column(name = "time_begin")
//    private Long begginingTime;
//
//    @Column(name = "time_end")
//    private Long endTime;
//
//	
//	
//	
//	public Menu() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//
//
//	public Long getId() {
//		return id;
//	}
//
//
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//
//
//	public Restaurant getRestaurant() {
//		return restaurant;
//	}
//
//
//
//
//	public void setRestaurant(Restaurant restaurant) {
//		this.restaurant = restaurant;
//	}
//
//
//
//
//	public Long getBegginingTime() {
//		return begginingTime;
//	}
//
//
//
//
//	public void setBegginingTime(Long begginingTime) {
//		this.begginingTime = begginingTime;
//	}
//
//
//
//
//	public Long getEndTime() {
//		return endTime;
//	}
//
//
//
//
//	public void setEndTime(Long endTime) {
//		this.endTime = endTime;
//	}
//
//
//
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((begginingTime == null) ? 0 : begginingTime.hashCode());
//		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((restaurant == null) ? 0 : restaurant.hashCode());
//		return result;
//	}
//
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Menu other = (Menu) obj;
//		if (begginingTime == null) {
//			if (other.begginingTime != null)
//				return false;
//		} else if (!begginingTime.equals(other.begginingTime))
//			return false;
//		if (endTime == null) {
//			if (other.endTime != null)
//				return false;
//		} else if (!endTime.equals(other.endTime))
//			return false;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (restaurant == null) {
//			if (other.restaurant != null)
//				return false;
//		} else if (!restaurant.equals(other.restaurant))
//			return false;
//		return true;
//	}
//
//
//
//
//	@Override
//	public String toString() {
//		return "Menu [id=" + id + ", restaurant=" + restaurant + ", begginingTime=" + begginingTime + ", endTime="
//				+ endTime + "]";
//	}
//
//
//
//}