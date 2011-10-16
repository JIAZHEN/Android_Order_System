package com.hibernate;

import com.hibernate.model.OrderDetailId;

/**
 * OrderDetail entity. @author MyEclipse Persistence Tools
 */

public class OrderDetail implements java.io.Serializable {

	// Fields

	private OrderDetailId id;
	private Integer number;

	// Constructors

	/** default constructor */
	public OrderDetail() {
	}

	/** full constructor */
	public OrderDetail(OrderDetailId id, Integer number) {
		this.id = id;
		this.number = number;
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

}