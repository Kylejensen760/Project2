package com.titans.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name ="restaurant_id")
	private Long restaurant_id; 
	
	
	
//	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	@JoinColumn(name="restaurant_id")
//	
   @OneToMany(fetch=FetchType.EAGER, mappedBy="restaurant") 
   private Set<MenuItem> menuItem = new HashSet<MenuItem>();
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="restaurant_tags",
			joinColumns=@JoinColumn(name="restaurant_id"),
			inverseJoinColumns=@JoinColumn(name="tag_id"))
	private Set<Tag> tags = new HashSet<Tag>();
	
	@Column(name = "restaurant_name")
	private String name;
	

	
	private String username;
	
	private String password;
	
	private String phone;
	
	private String email;
	
	@Column(name = "line_one")
	private String lineOne;
	
	@Column(name = "line_two")
	private String lineTwo;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	@Column(name = "website_url")
	private String websiteUrl;
	
	@Column(name = "opening_time")
	private Long openingTime;
	
	@Column(name = "closing_time")
	private Long closingTime;
	
	public Restaurant() {
		super();
	}

	public Long getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(Long restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public Set<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(Set<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public Long getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(Long openingTime) {
		this.openingTime = openingTime;
	}

	public Long getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(Long closingTime) {
		this.closingTime = closingTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((closingTime == null) ? 0 : closingTime.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((lineOne == null) ? 0 : lineOne.hashCode());
		result = prime * result + ((lineTwo == null) ? 0 : lineTwo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((openingTime == null) ? 0 : openingTime.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((restaurant_id == null) ? 0 : restaurant_id.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((websiteUrl == null) ? 0 : websiteUrl.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		Restaurant other = (Restaurant) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (closingTime == null) {
			if (other.closingTime != null)
				return false;
		} else if (!closingTime.equals(other.closingTime))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (lineOne == null) {
			if (other.lineOne != null)
				return false;
		} else if (!lineOne.equals(other.lineOne))
			return false;
		if (lineTwo == null) {
			if (other.lineTwo != null)
				return false;
		} else if (!lineTwo.equals(other.lineTwo))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (openingTime == null) {
			if (other.openingTime != null)
				return false;
		} else if (!openingTime.equals(other.openingTime))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (restaurant_id == null) {
			if (other.restaurant_id != null)
				return false;
		} else if (!restaurant_id.equals(other.restaurant_id))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (websiteUrl == null) {
			if (other.websiteUrl != null)
				return false;
		} else if (!websiteUrl.equals(other.websiteUrl))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurant_id=" + restaurant_id + ",tags=" + tags + ", name="
				+ name + ", username=" + username + ", password=" + password + ", phone=" + phone + ", email=" + email
				+ ", lineOne=" + lineOne + ", lineTwo=" + lineTwo + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", websiteUrl=" + websiteUrl + ", openingTime=" + openingTime + ", closingTime=" + closingTime
				+ "]";
	}

	

	
	
	
}
