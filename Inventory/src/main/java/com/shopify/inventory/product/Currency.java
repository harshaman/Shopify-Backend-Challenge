package com.shopify.inventory.product;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Embeddable
@Component
@Table(name = "currency")
public class Currency {
	
	@Column(name="code")
	private String code;
	
	@Column(name="symbol")
	private String symbol;
	
	@Column(name="curName")
	private String curName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCurName() {
		return curName;
	}

	public void setCurName(String curName) {
		this.curName = curName;
	} 
	

}
