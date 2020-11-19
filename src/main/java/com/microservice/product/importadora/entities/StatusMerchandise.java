package com.microservice.product.importadora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status_merchandise", catalog = "importadora")
public class StatusMerchandise implements java.io.Serializable {

	private static final long serialVersionUID = -8387399509971374456L;
	
	private int statusMerchandiseId;
	private String statusMerchandiseDescription;

	public StatusMerchandise() {
	}

	public StatusMerchandise(int statusMerchandiseId) {
		this.statusMerchandiseId = statusMerchandiseId;
	}

	public StatusMerchandise(int statusMerchandiseId, String statusMerchandiseDescription) {
		this.statusMerchandiseId = statusMerchandiseId;
		this.statusMerchandiseDescription = statusMerchandiseDescription;
	}

	@Id
	@Column(name = "status_merchandise_id", nullable = false)
	public int getStatusMerchandiseId() {
		return this.statusMerchandiseId;
	}

	public void setStatusMerchandiseId(int statusMerchandiseId) {
		this.statusMerchandiseId = statusMerchandiseId;
	}

	@Column(name = "status_merchandise_description", length = 200)
	public String getStatusMerchandiseDescription() {
		return this.statusMerchandiseDescription;
	}

	public void setStatusMerchandiseDescription(String statusMerchandiseDescription) {
		this.statusMerchandiseDescription = statusMerchandiseDescription;
	}

}
