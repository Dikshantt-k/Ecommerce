package com.example.eCommerce.entity;

public class Rating {
	
	private int total;
	private int fiveStarRating;
	private int fourStarRating;
	private int threeStarRating;
	private int twoStarRating;
	private int oneStarRating;
	private String review;
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getFiveStarRating() {
		return fiveStarRating;
	}
	public void setFiveStarRating(int fiveStarRating) {
		this.fiveStarRating = fiveStarRating;
	}
	public int getFourStarRating() {
		return fourStarRating;
	}
	public void setFourStarRating(int fourStarRating) {
		this.fourStarRating = fourStarRating;
	}
	public int getThreeStarRating() {
		return threeStarRating;
	}
	public void setThreeStarRating(int threeStarRating) {
		this.threeStarRating = threeStarRating;
	}
	public int getTwoStarRating() {
		return twoStarRating;
	}
	public void setTwoStarRating(int twoStarRating) {
		this.twoStarRating = twoStarRating;
	}
	public int getOneStarRating() {
		return oneStarRating;
	}
	public void setOneStarRating(int oneStarRating) {
		this.oneStarRating = oneStarRating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Rating(int total, int fiveStarRating, int fourStarRating, int threeStarRating, int twoStarRating,
			int oneStarRating, String review) {
		super();
		this.total = total;
		this.fiveStarRating = fiveStarRating;
		this.fourStarRating = fourStarRating;
		this.threeStarRating = threeStarRating;
		this.twoStarRating = twoStarRating;
		this.oneStarRating = oneStarRating;
		this.review = review;
	}
	public Rating() {
		super();
	}
	
	
	
	
	
}	
