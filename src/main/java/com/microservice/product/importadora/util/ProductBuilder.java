package com.microservice.product.importadora.util;

public class ProductBuilder {

	private int countryId;
	private int groupId;
	private int statusMerchandise;
	private String description;
	private int quantity;
	private byte[] picture;
	private String urlPicture;
	private int criticalStock;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getStatusMerchandise() {
		return statusMerchandise;
	}

	public void setStatusMerchandise(int statusMerchandise) {
		this.statusMerchandise = statusMerchandise;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getUrlPicture() {
		return urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	public int getCriticalStock() {
		return criticalStock;
	}

	public void setCriticalStock(int criticalStock) {
		this.criticalStock = criticalStock;
	}

	public ProductBuilder() {
		super();
	}

	public ProductBuilder(Builder builder) {
		super();
		this.countryId = countryId;
		this.groupId = groupId;
		this.statusMerchandise = statusMerchandise;
		this.description = description;
		this.quantity = quantity;
		this.picture = picture;
		this.urlPicture = urlPicture;
		this.criticalStock = criticalStock;
	}

	public static class Builder {

		private int countryId;
		private int groupId;
		private int statusMerchandise;
		private String description;
		private int quantity;
		private byte[] picture;
		private String urlPicture;
		private int criticalStock;

		public Builder addCountryId(int countryId) {
			this.countryId = countryId;
			return this;
		}

		public Builder addGroupId(int groupId) {
			this.groupId = groupId;
			return this;
		}

		public Builder addStatusMerchandise(Integer statusMerchandise) {
			this.statusMerchandise = statusMerchandise;
			return this;
		}

		public Builder addDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder addQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}

		public Builder addUrlPicture(String urlPicture) {
			this.urlPicture = urlPicture;
			return this;
		}

		public Builder addPicture(byte[] picture) {
			this.picture = picture;
			return this;
		}

		public Builder addCriticalStock(int criticalStock) {
			this.criticalStock = criticalStock;
			return this;
		}

		public ProductBuilder buildInsertNewProduct() {
			return new ProductBuilder(this);
		}

	}

}
