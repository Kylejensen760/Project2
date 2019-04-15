package com.titans.beans;

import java.io.Serializable;
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="reviews")
public class Review implements Serializable{
	 
	@Id
 	@SequenceGenerator(name="review_seq" , sequenceName="review_seq")
 	@GeneratedValue(generator="review_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "id")
	private int reviewId;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
 	@JoinColumn(name = "restaurant_id")
    @JsonBackReference
    private Restaurant restaurant;
	
	//@Column(name = "restaurant_id")
   // private int restaurantId;
	
	
	@Column(name = "customer_id")
    private int customerId;
	

	@Column(name = "rating")
    private int rating;
	
	@Column(name = "review_date")
    private String reviewDate;
	
	@Column(name = "review")
    private String review;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + rating;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + ((reviewDate == null) ? 0 : reviewDate.hashCode());
		result = prime * result + reviewId;
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
		Review other = (Review) obj;
		if (customerId != other.customerId)
			return false;
		if (rating != other.rating)
			return false;
		if (restaurant == null) {
			if (other.restaurant != null)
				return false;
		} else if (!restaurant.equals(other.restaurant))
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (reviewDate == null) {
			if (other.reviewDate != null)
				return false;
		} else if (!reviewDate.equals(other.reviewDate))
			return false;
		if (reviewId != other.reviewId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", restaurant=" + restaurant + ", customerId=" + customerId
				+ ", rating=" + rating + ", reviewDate=" + reviewDate + ", review=" + review + "]";
	}
	
	
    
    
}
