package com.shopify.inventory.populator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.PriceDataDTO;
import com.shopify.inventory.dto.ProductDTO;
import com.shopify.inventory.product.Product;

@Component
public class ProductReversePopulator extends Populator<Product, ProductDTO> {
	
	@Autowired
	private PriceDataReversePopulator priceDataReversePopulator;
	
	@Autowired PriceDataDTO priceData;

	public void populate(Product src, ProductDTO target) {
		target.setId(src.getId());
		target.setCount(src.getCount());
		target.setDescription(src.getDescription());
		target.setName(src.getName());
		target.setWarehouseCode(src.getWarehouse_code());
		priceDataReversePopulator.populate(src.getPriceData(), priceData);
		target.setPriceData(priceData);
	}

}
