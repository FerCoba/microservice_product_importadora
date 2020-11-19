package com.microservice.product.importadora.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country", catalog = "importadora")
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int countryId;
	private String description;

	public Country() {
	}

	public Country(int countryId) {
		this.countryId = countryId;
	}

	public Country(int countryId, String description) {
		this.countryId = countryId;
		this.description = description;
	}

	@Id
	@Column(name = "country_id", unique = true, nullable = false)
	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
