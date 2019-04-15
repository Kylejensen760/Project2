package com.titans.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review implements Serializable{
	 
	@Id
 	@SequenceGenerator(name="customers_seq" , sequenceName="customers_seq")
 	@GeneratedValue(generator="customers_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "id")
	private int reviewId;
	
	@Column(name = "restaurant_id")
    private int restaurantId;
	
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
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
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
		result = prime * result + restaurantId;
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
		if (restaurantId != other.restaurantId)
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
		return "Review [reviewId=" + reviewId + ", restaurantId=" + restaurantId + ", customerId=" + customerId
				+ ", rating=" + rating + ", reviewDate=" + reviewDate + ", review=" + review + "]";
	}
	public Review(int reviewId, int restaurantId, int customerId, int rating, String reviewDate, String review) {
		super();
		this.reviewId = reviewId;
		this.restaurantId = restaurantId;
		this.customerId = customerId;
		this.rating = rating;
		this.reviewDate = reviewDate;
		this.review = review;
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
