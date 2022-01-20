package com.shopify.inventory.populator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.ProductDTO;
import com.shopify.inventory.product.PriceData;
import com.shopify.inventory.product.Product;

@Component
public class ProductPopulator extends Populator<ProductDTO, Product>{
	
	@Autowired
	private PriceDataPopulator priceDataPopulator;
	
	@Autowired PriceData priceData;

	public void populate(ProductDTO src, Product target) {
		target.setId(src.getId());
		target.setCount(src.getCount());
		target.setDescription(src.getDescription());
		target.setName(src.getName());
		target.setWarehouse_code(src.getWarehouseCode());
		priceDataPopulator.populate(src.getPriceData(), priceData);
		target.setPriceData(priceData);
	}
}
