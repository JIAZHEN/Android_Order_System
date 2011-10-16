package com.hibernate.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Table entity. @author MyEclipse Persistence Tools
 */

public class Table implements java.io.Serializable {

	// Fields

	private Integer tableId;
	private Short tableStatus;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Table() {
	}

	/** minimal constructor */
	public Table(Short tableStatus) {
		this.tableStatus = tableStatus;
	}

	/** full constructor */
	public Table(Short tableStatus, Set orders) {
		this.tableStatus = tableStatus;
		this.orders = orders;
	}

	// Property accessors

	public Integer getTableId() {
		return this.tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public Short getTableStatus() {
		return this.tableStatus;
	}

	public void setTableStatus(Short tableStatus) {
		this.tableStatus = tableStatus;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}