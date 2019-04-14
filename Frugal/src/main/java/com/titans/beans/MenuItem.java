package com.titans.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="menu_item")
public class MenuItem{
	//add an annotation because MenuItem is named differently from the table
		
	 	@Id
	 	//@GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "id")
	 	private int menuItemId;
	 	
	 	@ManyToOne
	 	@JsonIgnore
	 	@JoinColumn(name = "restaurant_id", nullable=false)
	 	private Restaurant restaurant;
	 	
	 	@Column(name = "item_name")
	    private String itemName;
	 	
	 	@Column(name = "item_price")
	    private Double itemPrice; 
	 	
	 	@Column(name = "special_price")
	    private Double specialPrice;
	 	
	 	@Column(name = "special_day")
	    private Long specialDay;
	 	
	 	@Column(name = "special_start")
	    private Long specialStart;
	 	
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

		public MenuItem(int menuItemId, Restaurant restaurant, String itemName, Double itemPrice, Double specialPrice,
				Long specialDay, Long specialStart, Long specialEnd, Long mon, Long tue, Long wed, Long thu, Long fri,
				Long sat, Long sun) {
			super();
			this.menuItemId = menuItemId;
			this.restaurant = restaurant;
			this.itemName = itemName;
			this.itemPrice = itemPrice;
			this.specialPrice = specialPrice;
			this.specialDay = specialDay;
			this.specialStart = specialStart;
			this.specialEnd = specialEnd;
			this.mon = mon;
			this.tue = tue;
			this.wed = wed;
			this.thu = thu;
			this.fri = fri;
			this.sat = sat;
			this.sun = sun;
		}

		public int getMenuItemId() {
			return menuItemId;
		}

		public void setMenuItemId(int menuItemId) {
			this.menuItemId = menuItemId;
		}

		public Restaurant getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
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

		public Long getSpecialDay() {
			return specialDay;
		}

		public void setSpecialDay(Long specialDay) {
			this.specialDay = specialDay;
		}

		public Long getSpecialStart() {
			return specialStart;
		}

		public void setSpecialStart(Long specialStart) {
			this.specialStart = specialStart;
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
			result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
			result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
			result = prime * result + menuItemId;
			result = prime * result + ((mon == null) ? 0 : mon.hashCode());
			result = prime * result + ((restaurant == null) ? 0 : restaurant.hashCode());
			result = prime * result + ((sat == null) ? 0 : sat.hashCode());
			result = prime * result + ((specialDay == null) ? 0 : specialDay.hashCode());
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
			if (menuItemId != other.menuItemId)
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
			if (sat == null) {
				if (other.sat != null)
					return false;
			} else if (!sat.equals(other.sat))
				return false;
			if (specialDay == null) {
				if (other.specialDay != null)
					return false;
			} else if (!specialDay.equals(other.specialDay))
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
			return "MenuItem [menuItemId=" + menuItemId + ", restaurant=" + restaurant.getName() + ", itemName=" + itemName
					+ ", itemPrice=" + itemPrice + ", specialPrice=" + specialPrice + ", specialDay=" + specialDay
					+ ", specialStart=" + specialStart + ", specialEnd=" + specialEnd + ", mon=" + mon + ", tue=" + tue
					+ ", wed=" + wed + ", thu=" + thu + ", fri=" + fri + ", sat=" + sat + ", sun=" + sun + "]";
		}



		
		
}
