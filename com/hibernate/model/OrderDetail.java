package com.hibernate.model;


/**
 * OrderDetail entity. @author MyEclipse Persistence Tools
 */

public class OrderDetail implements java.io.Serializable {

	// Fields

	private OrderDetailId id;
	private Integer number;
	private String comments;

	// Constructors

	/** default constructor */
	public OrderDetail() {
	}

	/** minimal constructor */
	public OrderDetail(OrderDetailId id, Integer number) {
		this.id = id;
		this.number = number;
	}

	/** full constructor */
	public OrderDetail(OrderDetailId id, Integer number, String comments) {
		this.id = id;
		this.number = number;
		this.comments = comments;
	}

	// Property accessors

	public OrderDetailId getId() {
		return this.id;
	}

	public void setId(OrderDetailId id) {
		this.id = id;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}