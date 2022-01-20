package com.shopify.inventory.dto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"itemPrice",
	"itemTax",
	"grossPrice",
	"currency"
})
@Generated("jsonschema2pojo")
public class PriceDataDTO {

	@JsonProperty("itemPrice")
	private BigDecimal itemPrice;
	@JsonProperty("itemTax")
	private BigDecimal itemTax;
	@JsonProperty("grossPrice")
	private BigDecimal grossPrice;
	@JsonProperty("currency")
	private CurrencyData currency;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("itemPrice")
	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	@JsonProperty("itemPrice")
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	@JsonProperty("itemTax")
	public BigDecimal getItemTax() {
		return itemTax;
	}

	@JsonProperty("itemTax")
	public void setItemTax(BigDecimal itemTax) {
		this.itemTax = itemTax;
	}

	@JsonProperty("grossPrice")
	public BigDecimal getGrossPrice() {
		return grossPrice;
	}

	@JsonProperty("grossPrice")
	public void setGrossPrice(BigDecimal grossPrice) {
		this.grossPrice = grossPrice;
	}

	@JsonProperty("currency")
	public CurrencyData getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(CurrencyData currency) {
		this.currency = currency;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}