package com.micro.rating.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating_tbl")
public class RatingEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String ratingId;
	
	private String userId;
	
	private String hotelId;
	
	private int rating;
	
	private String feedback;

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public RatingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RatingEntity(String ratingId, String userId, String hotelId, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "RatingEntity [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating="
				+ rating + ", feedback=" + feedback + "]";
	}

}
