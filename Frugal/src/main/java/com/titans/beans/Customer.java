package com.titans.beans;


import java.util.HashSet;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Customer{
	
	 	@Id
	 	@SequenceGenerator(name="customers_seq" , sequenceName="customers_seq")
	 	@GeneratedValue(generator="customers_seq", strategy=GenerationType.SEQUENCE)
	 	@Column(name = "id")
	  	private int customerId;
	 	
	 	@OneToMany(fetch=FetchType.EAGER, mappedBy="restaurant",cascade=CascadeType.ALL) 
		@JsonManagedReference
		   private Set<Review> review = new HashSet<Review>();
	 	

	 	@Column(name = "first_name")
	    private String firstName;
	 	
	 	@Column(name = "last_name")
	    private String lastName;
	 	
	 	@Column(name = "username")
	    private String username;
	 	
	 	@Column(name = "password")
	    private String password;
	 	
	 	@Column(name = "phone")
	    private String phone;
	 	
	 	@Column(name = "email")
	    private String email;
	 	
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Customer(int customerId, Set<Restaurant> favoritedRestaurants, String firstName, String lastName,
				String username, String password, String phone, String email) {
			super();
			this.customerId = customerId;
//			this.favoritedRestaurants = favoritedRestaurants;
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
			this.password = password;
			this.phone = phone;
			this.email = email;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		
//		public Set<Restaurant> getFavoritedRestaurants() {
//			return favoritedRestaurants;
//		}
//		public void setFavoritedRestaurants(Set<Restaurant> favoritedRestaurants) {
//			this.favoritedRestaurants = favoritedRestaurants;
//		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + customerId;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
//			result = prime * result + ((favoritedRestaurants == null) ? 0 : favoritedRestaurants.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((phone == null) ? 0 : phone.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
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
			Customer other = (Customer) obj;
			if (customerId != other.customerId)
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
//			if (favoritedRestaurants == null) {
//				if (other.favoritedRestaurants != null)
//					return false;
//			} else if (!favoritedRestaurants.equals(other.favoritedRestaurants))
//				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
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
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", favoritedRestaurants=" + "favoritedRestaurants"
					+ ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
					+ password + ", phone=" + phone + ", email=" + email + "]";
		}
		
		
}
