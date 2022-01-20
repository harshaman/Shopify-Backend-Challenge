package com.shopify.inventory.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shopify.inventory.product.Product;

@Component
public interface InventoryService {
	
	public void saveProduct(Product product);
	
	public List<Product> fetchInventoryDetails();
	
	public Product findProductById(long id);
	
	public void deleteProduct(Product product);

}
