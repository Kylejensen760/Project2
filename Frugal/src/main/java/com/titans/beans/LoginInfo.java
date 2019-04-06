package com.titans.beans;

public class LoginInfo {
	private Customer customer;
	private Restaurant restaurant;
	
	public LoginInfo() {
		super();
	}
	public LoginInfo(Customer cust, Restaurant rest) {
		super();
		this.customer = cust;
		this.restaurant = rest;
	}
	
	public LoginInfo(Customer customer) {
		super();
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer cust) {
		this.customer = cust;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant rest) {
		this.restaurant = rest;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((restaurant == null) ? 0 : restaurant.hashCode());
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
		LoginInfo other = (LoginInfo) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (restaurant == null) {
			if (other.restaurant != null)
				return false;
		} else if (!restaurant.equals(other.restaurant))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginInfo [cust=");
		builder.append(customer);
		builder.append(", emp=");
		builder.append(employee);
		builder.append("]");
		return builder.toString();
	}
}
