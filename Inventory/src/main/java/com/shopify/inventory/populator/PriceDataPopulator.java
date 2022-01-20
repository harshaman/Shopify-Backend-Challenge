package com.shopify.inventory.populator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.PriceDataDTO;
import com.shopify.inventory.product.Currency;
import com.shopify.inventory.product.PriceData;

@Component
public class PriceDataPopulator extends Populator<PriceDataDTO, PriceData> {

	@Autowired
	private CurrencyPopulator currencyPopulator;
	
	@Autowired
	private Currency currency;
	
	public void populate(PriceDataDTO src, PriceData target) {
		
		currencyPopulator.populate(src.getCurrency(), currency);
		target.setCurrency(currency);
		target.setGrossPrice(src.getGrossPrice());
		target.setItemPrice(src.getItemPrice());
		target.setItemTax(src.getItemPrice());

	}

}
