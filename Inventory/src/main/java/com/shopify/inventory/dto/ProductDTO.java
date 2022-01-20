package com.shopify.inventory.dto;

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
	"id",
	"name",
	"description",
	"count",
	"warehouse_code",
	"priceData"
})
@Generated("jsonschema2pojo")
public class ProductDTO {

	@JsonProperty("id")
	private long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("count")
	private int count;
	@JsonProperty("warehouse_code")
	private String warehouseCode;
	@JsonProperty("priceData")
	private PriceDataDTO priceData;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("count")
	public int getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(int count) {
		this.count = count;
	}

	@JsonProperty("warehouse_code")
	public String getWarehouseCode() {
		return warehouseCode;
	}

	@JsonProperty("warehouse_code")
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	@JsonProperty("priceData")
	public PriceDataDTO getPriceData() {
		return priceData;
	}

	@JsonProperty("priceData")
	public void setPriceData(PriceDataDTO priceData) {
		this.priceData = priceData;
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