package com.shopify.inventory.product;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Embeddable
@Component
@Table(name = "PriceData")
public class PriceData {
	
	@Column(name="itemPrice")
	private BigDecimal itemPrice;
	
	@Column(name="itemTax")
	private BigDecimal itemTax;
	
	@Column(name="grossPrice")
	private BigDecimal grossPrice;
	
	@Embedded
	private Currency currency;

	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public BigDecimal getItemTax() {
		return itemTax;
	}

	public void setItemTax(BigDecimal itemTax) {
		this.itemTax = itemTax;
	}

	public BigDecimal getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(BigDecimal grossPrice) {
		this.grossPrice = grossPrice;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
}
