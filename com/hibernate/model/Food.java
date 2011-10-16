package com.hibernate.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */

public class Food implements java.io.Serializable {

	// Fields

	private Integer foodId;
	private Category category;
	private String foodCname;
	private String foodEname;
	private Double foodPrice;
	private Double foodDiscount;
	private String foodCdescription;
	private String foodEdescription;
	private Timestamp foodAddDate;
	private String foodPicPath;
	private Set orderDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Food() {
	}

	/** minimal constructor */
	public Food(Category category, String foodCname, String foodEname,
			Double foodPrice, Double foodDiscount, Timestamp foodAddDate) {
		this.category = category;
		this.foodCname = foodCname;
		this.foodEname = foodEname;
		this.foodPrice = foodPrice;
		this.foodDiscount = foodDiscount;
		this.foodAddDate = foodAddDate;
	}

	/** full constructor */
	public Food(Category category, String foodCname, String foodEname,
			Double foodPrice, Double foodDiscount, String foodCdescription,
			String foodEdescription, Timestamp foodAddDate, String foodPicPath,
			Set orderDetails) {
		this.category = category;
		this.foodCname = foodCname;
		this.foodEname = foodEname;
		this.foodPrice = foodPrice;
		this.foodDiscount = foodDiscount;
		this.foodCdescription = foodCdescription;
		this.foodEdescription = foodEdescription;
		this.foodAddDate = foodAddDate;
		this.foodPicPath = foodPicPath;
		this.orderDetails = orderDetails;
	}

	// Property accessors

	public Integer getFoodId() {
		return this.foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getFoodCname() {
		return this.foodCname;
	}

	public void setFoodCname(String foodCname) {
		this.foodCname = foodCname;
	}

	public String getFoodEname() {
		return this.foodEname;
	}

	public void setFoodEname(String foodEname) {
		this.foodEname = foodEname;
	}

	public Double getFoodPrice() {
		return this.foodPrice;
	}

	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Double getFoodDiscount() {
		return this.foodDiscount;
	}

	public void setFoodDiscount(Double foodDiscount) {
		this.foodDiscount = foodDiscount;
	}

	public String getFoodCdescription() {
		return this.foodCdescription;
	}

	public void setFoodCdescription(String foodCdescription) {
		this.foodCdescription = foodCdescription;
	}

	public String getFoodEdescription() {
		return this.foodEdescription;
	}

	public void setFoodEdescription(String foodEdescription) {
		this.foodEdescription = foodEdescription;
	}

	public Timestamp getFoodAddDate() {
		return this.foodAddDate;
	}

	public void setFoodAddDate(Timestamp foodAddDate) {
		this.foodAddDate = foodAddDate;
	}

	public String getFoodPicPath() {
		return this.foodPicPath;
	}

	public void setFoodPicPath(String foodPicPath) {
		this.foodPicPath = foodPicPath;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

}