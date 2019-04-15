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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="menu_item")
public class MenuItem implements Serializable{
	//add an annotation because MenuItem is named differently from the table
		
	 	@Id
	 	//@GeneratedValue(strategy = GenerationType.AUTO)
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
	 	
	 	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	 	@JoinColumn(name = "restaurant_id")
	    @JsonBackReference
	    private Restaurant restaurant;
	 	
	 	@Column(name = "special_end")
	    private Long specialEnd;

		public MenuItem() {
			super();
			// TODO Auto-generated constructor stub
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


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
			result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
			result = prime * result + ((restaurant == null) ? 0 : restaurant.hashCode());
			result = prime * result + ((specialEnd == null) ? 0 : specialEnd.hashCode());
			result = prime * result + ((specialPrice == null) ? 0 : specialPrice.hashCode());
			result = prime * result + ((specialStart == null) ? 0 : specialStart.hashCode());
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
			if (restaurant == null) {
				if (other.restaurant != null)
					return false;
			} else if (!restaurant.equals(other.restaurant))
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
			return true;
		}

		@Override
		public String toString() {
			return "MenuItem [id=" + id + ", itemName=" + itemName + ", itemPrice="
					+ itemPrice + ", specialPrice=" + specialPrice + ", specialStart="
					+ specialStart + ", specialEnd=" + specialEnd + "]";
		}

	

	    
	    

}