package com.product.Service;

import java.util.List;
import java.util.Optional;

import com.product.domain.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();
	
	public Optional<Product> getProduct(Long id);
	
	public Product addProduct(Product prod);
	
	
	public void deleteProduct(Long id);

}
