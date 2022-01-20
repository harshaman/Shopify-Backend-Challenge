package com.shopify.inventory.populator;

import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.PriceDataDTO;
import com.shopify.inventory.product.PriceData;

@Component
public class PriceDataReversePopulator extends Populator<PriceData, PriceDataDTO> {
	
	public void populate(PriceData src, PriceDataDTO target) {

		target.setGrossPrice(src.getGrossPrice());
		target.setItemPrice(src.getItemPrice());
		target.setItemTax(src.getItemPrice());
	}

}
