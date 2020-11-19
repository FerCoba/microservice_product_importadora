package com.microservice.product.importadora.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "product" , catalog = "importadora")
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = -1316448241697448173L;
	
	private Integer productId;
	private Country country;
	private Group group;
	private StatusMerchandise statusMerchandise;
	private String description;
	private int quantity;
	private byte[] picture;
	private String urlPicture;
	private int criticalStock;

	public Product() {
	}

	

	public Product(Integer productId, Country country, Group group, StatusMerchandise statusMerchandise,
			String description, int quantity, byte[] picture, String urlPicture, int criticalStock) {
		super();
		this.productId = productId;
		this.country = country;
		this.group = group;
		this.statusMerchandise = statusMerchandise;
		this.description = description;
		this.quantity = quantity;
		this.picture = picture;
		this.urlPicture = urlPicture;
		this.criticalStock = criticalStock;
	}



	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "product_id", unique = true, nullable = false)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	@ManyToOne(targetEntity = Country.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId")
	@JsonBackReference(value = "country")
//	@Column(name = "country_id")
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@ManyToOne(targetEntity = Group.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "groupId")
	@JsonBackReference(value = "group")
	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@ManyToOne(targetEntity = StatusMerchandise.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "statusMerchandiseId")
	@JsonBackReference(value = "statusMerchandise")
	public StatusMerchandise getStatusMerchandise() {
		return this.statusMerchandise;
	}

	public void setStatusMerchandise(StatusMerchandise statusMerchandise) {
		this.statusMerchandise = statusMerchandise;
	}

	@Column(name = "description", nullable = false, length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Lob
    @Column(name="picture")
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	@Column(name = "url_picture", nullable = true, length = 200)
	public String getUrlPicture() {
		return this.urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	@Column(name = "critical_stock", nullable = false)
	public int getCriticalStock() {
		return this.criticalStock;
	}

	public void setCriticalStock(int criticalStock) {
		this.criticalStock = criticalStock;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", country=" + country + ", group=" + group + ", statusMerchandise="
				+ statusMerchandise + ", description=" + description + ", quantity=" + quantity + ", picture="
				+ Arrays.toString(picture) + ", urlPicture=" + urlPicture + ", criticalStock=" + criticalStock + "]";
	}
}
