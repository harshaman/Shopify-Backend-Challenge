package com.shopify.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.shopify.inventory.dto.ProductDTO;
import com.shopify.inventory.facade.InventoryFacade;

@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryFacade inventoryFacade;
	
	@GetMapping(value = "/getDetails")
	public List<ProductDTO> getInventoryDetails() {
		return inventoryFacade.getInventoryDetails();
	}
	
	@PostMapping(value="/product/add")
	@ResponseStatus(HttpStatus.CREATED)
	public HttpStatus addProduct(@RequestBody ProductDTO productDto) {
		Preconditions.checkNotNull(productDto);
        return inventoryFacade.add(productDto);
		
	}
	
	@PutMapping(value="/product/update")
	@ResponseStatus(HttpStatus.OK)
	public HttpStatus updateProduct(@RequestBody ProductDTO productDto) {
		Preconditions.checkNotNull(productDto);
        return inventoryFacade.update(productDto);
		
	}
	
	@DeleteMapping(value="/product/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public HttpStatus deleteProduct(@PathVariable long id) {
		Preconditions.checkNotNull(id);
        return inventoryFacade.delete(id);
		
	}

}
