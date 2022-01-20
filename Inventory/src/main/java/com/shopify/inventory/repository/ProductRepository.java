package com.shopify.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.shopify.inventory.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>  {
	
	//void saveProduct(Product product);

}
