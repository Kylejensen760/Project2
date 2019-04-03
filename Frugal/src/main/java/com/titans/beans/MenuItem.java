package com.titans.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItem implements Serializable{
	//add an annotation because MenuItem is named differently from the table
		
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "id")
	 	private int menuItemId;
	 	
	 	@Column(name = "menu_id")
	    private int menuId;
	 	
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
	    
	    
		public int getMenuItemId() {
			return menuItemId;
		}
		public void setMenuItemId(int menuItemId) {
			this.menuItemId = menuItemId;
		}
		public int getMenuId() {
			return menuId;
		}
		public void setMenuId(int menuId) {
			this.menuId = menuId;
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
		public int getSpecialStart() {
			return specialStart;
		}
		public void setSpecialStart(int specialStart) {
			this.specialStart = specialStart;
		}
		public int getSpecialEnd() {
			return specialEnd;
		}
		public void setSpecialEnd(int specialEnd) {
			this.specialEnd = specialEnd;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
			result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
			result = prime * result + menuId;
			result = prime * result + menuItemId;
			result = prime * result + ((specialDay == null) ? 0 : specialDay.hashCode());
			result = prime * result + specialEnd;
			result = prime * result + ((specialPrice == null) ? 0 : specialPrice.hashCode());
			result = prime * result + specialStart;
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
			if (menuId != other.menuId)
				return false;
			if (menuItemId != other.menuItemId)
				return false;
			if (specialDay == null) {
				if (other.specialDay != null)
					return false;
			} else if (!specialDay.equals(other.specialDay))
				return false;
			if (specialEnd != other.specialEnd)
				return false;
			if (specialPrice == null) {
				if (other.specialPrice != null)
					return false;
			} else if (!specialPrice.equals(other.specialPrice))
				return false;
			if (specialStart != other.specialStart)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "MenuItem [menuItemId=" + menuItemId + ", menuId=" + menuId + ", itemName=" + itemName
					+ ", itemPrice=" + itemPrice + ", specialPrice=" + specialPrice + ", specialDay=" + specialDay
					+ ", specialStart=" + specialStart + ", specialEnd=" + specialEnd + "]";
		}
		public MenuItem(int menuItemId, int menuId, String itemName, Double itemPrice, Double specialPrice,
				Long specialDay, int specialStart, int specialEnd) {
			super();
			this.menuItemId = menuItemId;
			this.menuId = menuId;
			this.itemName = itemName;
			this.itemPrice = itemPrice;
			this.specialPrice = specialPrice;
			this.specialDay = specialDay;
			this.specialStart = specialStart;
			this.specialEnd = specialEnd;
		}
		public MenuItem() {
			super();
			// TODO Auto-generated constructor stub
		} 
	
	    

}
