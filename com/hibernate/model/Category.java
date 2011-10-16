package com.hibernate.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String CCname;
	private String CEname;
	private Integer parentId;
	private Integer level;
	private Timestamp CAddTime;
	private Set foods = new HashSet(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String CCname, String CEname, Integer level,
			Timestamp CAddTime) {
		this.CCname = CCname;
		this.CEname = CEname;
		this.level = level;
		this.CAddTime = CAddTime;
	}

	/** full constructor */
	public Category(String CCname, String CEname, Integer parentId,
			Integer level, Timestamp CAddTime, Set foods) {
		this.CCname = CCname;
		this.CEname = CEname;
		this.parentId = parentId;
		this.level = level;
		this.CAddTime = CAddTime;
		this.foods = foods;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCCname() {
		return this.CCname;
	}

	public void setCCname(String CCname) {
		this.CCname = CCname;
	}

	public String getCEname() {
		return this.CEname;
	}

	public void setCEname(String CEname) {
		this.CEname = CEname;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Timestamp getCAddTime() {
		return this.CAddTime;
	}

	public void setCAddTime(Timestamp CAddTime) {
		this.CAddTime = CAddTime;
	}

	public Set getFoods() {
		return this.foods;
	}

	public void setFoods(Set foods) {
		this.foods = foods;
	}

}