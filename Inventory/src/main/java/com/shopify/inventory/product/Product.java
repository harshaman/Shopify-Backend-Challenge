package com.shopify.inventory.product;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
@Component
public class Product {
	@Id
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Embedded
	private PriceData priceData;
	
	@Column(name = "count")
	private int count;
	
	@Column(name = "warehouse_code")
	private String warehouse_code;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getWarehouse_code() {
		return warehouse_code;
	}
	public void setWarehouse_code(String warehouse_code) {
		this.warehouse_code = warehouse_code;
	}
	public PriceData getPriceData() {
		return priceData;
	}
	public void setPriceData(PriceData priceData) {
		this.priceData = priceData;
	}
	
	

}
