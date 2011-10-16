package com.hibernate.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Stuff entity. @author MyEclipse Persistence Tools
 */

public class Stuff implements java.io.Serializable {

	// Fields

	private String stuffName;
	private String stuffTitle;
	private Short level;
	private String password;
	private String barcode;
	private Timestamp stuffAddTime;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stuff() {
	}

	/** minimal constructor */
	public Stuff(String stuffName, String stuffTitle, Short level,
			Timestamp stuffAddTime) {
		this.stuffName = stuffName;
		this.stuffTitle = stuffTitle;
		this.level = level;
		this.stuffAddTime = stuffAddTime;
	}

	/** full constructor */
	public Stuff(String stuffName, String stuffTitle, Short level,
			String password, String barcode, Timestamp stuffAddTime, Set orders) {
		this.stuffName = stuffName;
		this.stuffTitle = stuffTitle;
		this.level = level;
		this.password = password;
		this.barcode = barcode;
		this.stuffAddTime = stuffAddTime;
		this.orders = orders;
	}

	// Property accessors

	public String getStuffName() {
		return this.stuffName;
	}

	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	public String getStuffTitle() {
		return this.stuffTitle;
	}

	public void setStuffTitle(String stuffTitle) {
		this.stuffTitle = stuffTitle;
	}

	public Short getLevel() {
		return this.level;
	}

	public void setLevel(Short level) {
		this.level = level;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Timestamp getStuffAddTime() {
		return this.stuffAddTime;
	}

	public void setStuffAddTime(Timestamp stuffAddTime) {
		this.stuffAddTime = stuffAddTime;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}