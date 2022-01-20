package com.shopify.inventory.populator;

import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.CurrencyData;
import com.shopify.inventory.dto.PriceDataDTO;
import com.shopify.inventory.product.Currency;
import com.shopify.inventory.product.PriceData;

@Component
public class CurrencyPopulator extends Populator<CurrencyData, Currency> {
	
public void populate(CurrencyData src, Currency target) {
		
		
		target.setCode(src.getCode());
		target.setCurName(src.getCurName());
		target.setSymbol(src.getSymbol());

	}

}
