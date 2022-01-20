package com.shopify.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopify.inventory.product.Product;
import com.shopify.inventory.repository.ProductRepository;
import com.shopify.inventory.service.InventoryService;

@Component
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void saveProduct(Product product) {

		productRepository.save(product);
		

	}

	@Override
	public List<Product> fetchInventoryDetails() {

		List<Product> result = productRepository.findAll();
		return result;
	}

	@Override
	public Product findProductById(long id) {
		Optional<Product> result = productRepository.findById(id);
		return result.isPresent()? result.get() : null;
		
	}

	@Override
	public void deleteProduct(Product productToDelete) {
		productRepository.delete(productToDelete);
		
	}

}
