package com.hibernate.model;


/**
 * OrderDetailId entity. @author MyEclipse Persistence Tools
 */

public class OrderDetailId implements java.io.Serializable {

	// Fields

	private Order order;
	private Food food;

	// Constructors

	/** default constructor */
	public OrderDetailId() {
	}

	/** full constructor */
	public OrderDetailId(Order order, Food food) {
		this.order = order;
		this.food = food;
	}

	// Property accessors

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Food getFood() {
		return this.food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderDetailId))
			return false;
		OrderDetailId castOther = (OrderDetailId) other;

		return ((this.getOrder() == castOther.getOrder()) || (this.getOrder() != null
				&& castOther.getOrder() != null && this.getOrder().equals(
				castOther.getOrder())))
				&& ((this.getFood() == castOther.getFood()) || (this.getFood() != null
						&& castOther.getFood() != null && this.getFood()
						.equals(castOther.getFood())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrder() == null ? 0 : this.getOrder().hashCode());
		result = 37 * result
				+ (getFood() == null ? 0 : this.getFood().hashCode());
		return result;
	}

}