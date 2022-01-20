package com.shopify.inventory.product;


public enum Currencyenum {
	USD("United States Dollar", "$"), 
	INR("Indian National Rupee", "₹"),
	GBP("Great Britain Pound", "£"),
	AUD("Australian Dollar", "A$"),
	EUR("Euro", "€");
	
	
	Currencyenum(String string, String string2) {
		this.symbol = string2;
		this.name=string;
		// TODO Auto-generated constructor stub
	}

	private final String symbol;
	private final String name;
	
	
}
