package com.shopify.inventory.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.shopify.inventory.dto.ProductDTO;
import com.shopify.inventory.facade.InventoryFacade;
import com.shopify.inventory.populator.ProductPopulator;
import com.shopify.inventory.populator.ProductReversePopulator;
import com.shopify.inventory.product.Product;
import com.shopify.inventory.service.InventoryService;

@Component
public class InventoryFacadeImpl implements InventoryFacade {

	@Autowired
	private ProductPopulator  productPopulator;
	
	@Autowired
	private ProductReversePopulator productReversePopulator;
	
	@Autowired
	private InventoryService inventoryService;
	
	@Autowired
	private Product product;
	
	private ProductDTO responseDTO;
	
	@Override
	public HttpStatus add(ProductDTO productDto) {

		productPopulator.populate(productDto, product);
		inventoryService.saveProduct(product);
		return HttpStatus.CREATED;
		
	}
	
	@Override
	public List<ProductDTO> getInventoryDetails(){

		List<Product> productList = inventoryService.fetchInventoryDetails();
		List<ProductDTO> productDataList =  new ArrayList<>();
		
		
		productList.stream().forEach(product -> {
			responseDTO=new ProductDTO();
			productReversePopulator.populate(product, responseDTO);
			productDataList.add(responseDTO);
		});
		
		return productDataList;
		
	}

	@Override
	public HttpStatus update(ProductDTO productDto) {
		
		Product productToUpdate = inventoryService.findProductById(productDto.getId());
		if(productToUpdate==null) {
			return HttpStatus.BAD_REQUEST;
		}
		productPopulator.populate(productDto, productToUpdate);
		inventoryService.saveProduct(productToUpdate);
		return HttpStatus.OK;
	}

	@Override
	public HttpStatus delete(long id) {
		
		Product productToDelete = inventoryService.findProductById(id);
		if(productToDelete==null) {
			return HttpStatus.BAD_REQUEST;
		}
		inventoryService.deleteProduct(productToDelete);
		return HttpStatus.OK;
	}

}
