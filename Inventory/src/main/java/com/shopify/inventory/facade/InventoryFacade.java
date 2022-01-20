package com.shopify.inventory.facade;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.ProductDTO;

@Component
public interface InventoryFacade {
	
	public HttpStatus add(ProductDTO productDto);
	
	public List<ProductDTO> getInventoryDetails();
	
	public HttpStatus update(ProductDTO productDto);
	
	public HttpStatus delete(long id);

}
