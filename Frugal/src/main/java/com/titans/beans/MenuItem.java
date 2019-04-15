package com.titans.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="menu_item")
public class MenuItem implements Serializable{
	//add an annotation because MenuItem is named differently from the table
		
	 	@Id
	 	@SequenceGenerator(name="menuitem_seq" , sequenceName="menuitem_seq")
	 	@GeneratedValue(generator="menuitem_seq", strategy = GenerationType.AUTO)
	 	@Column(name = "id")
	 	private Long id;
	 	
//	 	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//		@JoinColumn(name="cave_id")
	 	
//	 	@Column(name = "restaurant_id")
//	 	private String restaurantId;
	 	
	 	
	 	
	 	@Column(name = "item_name")
	    private String itemName;
	 	
	 	@Column(name = "item_price")
	    private Double itemPrice; 
	 	
	 	@Column(name = "special_price")
	    private Double specialPrice;
	 	
	 	@Column(name = "special_start")
	    private Long specialStart;
	 	
	 	@Column(name = "restaurant_id")
	 	private Long restaurant_id;
	 	
	 	@ManyToOne(fetch=FetchType.EAGER)
	 	@JoinColumn(name = "restaurant_id", insertable=false, updatable=false, nullable=false)
	    @JsonBackReference
	    private Restaurant restaurant;
	 	
	 	@Column(name = "special_end")
	    private Long specialEnd;
	 	
	 	@Column(name = "mon")
	 	private Long mon;
	 	
	 	@Column(name = "tue")
	 	private Long tue;

	 	@Column(name = "wed")
	 	private Long wed;

	 	@Column(name = "thu")
	 	private Long thu;

	 	@Column(name = "fri")
	 	private Long fri;

	 	@Column(name = "sat")
	 	private Long sat;

	 	@Column(name = "sun")
	 	private Long sun;


		public MenuItem() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Long getRestaurant_id() {
			return restaurant_id;
		}


		public void setRestaurant_id(Long restaurant_id) {
			this.restaurant_id = restaurant_id;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getItemName() {
			return itemName;
		}


		public void setItemName(String itemName) {
			this.itemName = itemName;
		}


		public Double getItemPrice() {
			return itemPrice;
		}


		public void setItemPrice(Double itemPrice) {
			this.itemPrice = itemPrice;
		}


		public Double getSpecialPrice() {
			return specialPrice;
		}


		public void setSpecialPrice(Double specialPrice) {
			this.specialPrice = specialPrice;
		}


		public Long getSpecialStart() {
			return specialStart;
		}


		public void setSpecialStart(Long specialStart) {
			this.specialStart = specialStart;
		}


		public Restaurant getRestaurant() {
			return restaurant;
		}


		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}


		public Long getSpecialEnd() {
			return specialEnd;
		}


		public void setSpecialEnd(Long specialEnd) {
			this.specialEnd = specialEnd;
		}


		public Long getMon() {
			return mon;
		}


		public void setMon(Long mon) {
			this.mon = mon;
		}


		public Long getTue() {
			return tue;
		}


		public void setTue(Long tue) {
			this.tue = tue;
		}


		public Long getWed() {
			return wed;
		}


		public void setWed(Long wed) {
			this.wed = wed;
		}


		public Long getThu() {
			return thu;
		}


		public void setThu(Long thu) {
			this.thu = thu;
		}


		public Long getFri() {
			return fri;
		}


		public void setFri(Long fri) {
			this.fri = fri;
		}


		public Long getSat() {
			return sat;
		}


		public void setSat(Long sat) {
			this.sat = sat;
		}


		public Long getSun() {
			return sun;
		}


		public void setSun(Long sun) {
			this.sun = sun;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fri == null) ? 0 : fri.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
			result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
			result = prime * result + ((mon == null) ? 0 : mon.hashCode());
			result = prime * result + ((restaurant == null) ? 0 : restaurant.hashCode());
			result = prime * result + ((restaurant_id == null) ? 0 : restaurant_id.hashCode());
			result = prime * result + ((sat == null) ? 0 : sat.hashCode());
			result = prime * result + ((specialEnd == null) ? 0 : specialEnd.hashCode());
			result = prime * result + ((specialPrice == null) ? 0 : specialPrice.hashCode());
			result = prime * result + ((specialStart == null) ? 0 : specialStart.hashCode());
			result = prime * result + ((sun == null) ? 0 : sun.hashCode());
			result = prime * result + ((thu == null) ? 0 : thu.hashCode());
			result = prime * result + ((tue == null) ? 0 : tue.hashCode());
			result = prime * result + ((wed == null) ? 0 : wed.hashCode());
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
			MenuItem other = (MenuItem) obj;
			if (fri == null) {
				if (other.fri != null)
					return false;
			} else if (!fri.equals(other.fri))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (itemName == null) {
				if (other.itemName != null)
					return false;
			} else if (!itemName.equals(other.itemName))
				return false;
			if (itemPrice == null) {
				if (other.itemPrice != null)
					return false;
			} else if (!itemPrice.equals(other.itemPrice))
				return false;
			if (mon == null) {
				if (other.mon != null)
					return false;
			} else if (!mon.equals(other.mon))
				return false;
			if (restaurant == null) {
				if (other.restaurant != null)
					return false;
			} else if (!restaurant.equals(other.restaurant))
				return false;
			if (restaurant_id == null) {
				if (other.restaurant_id != null)
					return false;
			} else if (!restaurant_id.equals(other.restaurant_id))
				return false;
			if (sat == null) {
				if (other.sat != null)
					return false;
			} else if (!sat.equals(other.sat))
				return false;
			if (specialEnd == null) {
				if (other.specialEnd != null)
					return false;
			} else if (!specialEnd.equals(other.specialEnd))
				return false;
			if (specialPrice == null) {
				if (other.specialPrice != null)
					return false;
			} else if (!specialPrice.equals(other.specialPrice))
				return false;
			if (specialStart == null) {
				if (other.specialStart != null)
					return false;
			} else if (!specialStart.equals(other.specialStart))
				return false;
			if (sun == null) {
				if (other.sun != null)
					return false;
			} else if (!sun.equals(other.sun))
				return false;
			if (thu == null) {
				if (other.thu != null)
					return false;
			} else if (!thu.equals(other.thu))
				return false;
			if (tue == null) {
				if (other.tue != null)
					return false;
			} else if (!tue.equals(other.tue))
				return false;
			if (wed == null) {
				if (other.wed != null)
					return false;
			} else if (!wed.equals(other.wed))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "MenuItem [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", specialPrice="
					+ specialPrice + ", specialStart=" + specialStart + ", restaurant_id=" + restaurant_id
					+ ", restaurant=" + restaurant + ", specialEnd=" + specialEnd + ", mon=" + mon + ", tue=" + tue
					+ ", wed=" + wed + ", thu=" + thu + ", fri=" + fri + ", sat=" + sat + ", sun=" + sun + "]";
		}


		public MenuItem(Long id, String itemName, Double itemPrice, Double specialPrice, Long specialStart,
				Long restaurant_id, Restaurant restaurant, Long specialEnd, Long mon, Long tue, Long wed, Long thu,
				Long fri, Long sat, Long sun) {
			super();
			this.id = id;
			this.itemName = itemName;
			this.itemPrice = itemPrice;
			this.specialPrice = specialPrice;
			this.specialStart = specialStart;
			this.restaurant_id = restaurant_id;
			this.restaurant = restaurant;
			this.specialEnd = specialEnd;
			this.mon = mon;
			this.tue = tue;
			this.wed = wed;
			this.thu = thu;
			this.fri = fri;
			this.sat = sat;
			this.sun = sun;
		}


}