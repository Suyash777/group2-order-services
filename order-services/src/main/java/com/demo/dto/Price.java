package com.demo.dto;

import jakarta.persistence.Column;


public class Price {
	private Long id;
	@Column(unique = true)
	private String priceKey;
	@Column(unique = false) 
	private String sku;
	@Column(nullable = true)
	private Double centAmount;
	private String currency;
	
	
	public Price(String priceKey, String sku, Double centAmount, String currency) {
		super();
		this.priceKey = priceKey;
		this.sku = sku;
		this.centAmount = centAmount;
		this.currency = currency;
	}
	public Price() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPriceKey() {
		return priceKey;
	}
	public void setPriceKey(String priceKey) {
		this.priceKey = priceKey;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Double getCentAmount() {
		return centAmount;
	}
	public void setCentAmount(Double centAmount) {
		this.centAmount = centAmount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

}
