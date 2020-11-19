package com.microservice.product.importadora.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group", catalog = "importadora")
public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int groupId;
	private String description;

	public Group() {
	}

	public Group(int groupId) {
		this.groupId = groupId;
	}

	public Group(int groupId, String description) {
		this.groupId = groupId;
		this.description = description;
	}

	@Id
	@Column(name = "group_id", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
