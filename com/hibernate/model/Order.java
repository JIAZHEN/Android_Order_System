package com.hibernate.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Table table;
	private Stuff stuff;
	private Double discount;
	private Timestamp orderDate;
	private Set orderDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Table table, Stuff stuff, Timestamp orderDate) {
		this.table = table;
		this.stuff = stuff;
		this.orderDate = orderDate;
	}

	/** full constructor */
	public Order(Table table, Stuff stuff, Double discount,
			Timestamp orderDate, Set orderDetails) {
		this.table = table;
		this.stuff = stuff;
		this.discount = discount;
		this.orderDate = orderDate;
		this.orderDetails = orderDetails;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Table getTable() {
		return this.table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

}