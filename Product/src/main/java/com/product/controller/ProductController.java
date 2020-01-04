package com.product.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.Service.ProductService;
import com.product.domain.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok(productService.getAllProduct());
	}
	
	@PostMapping
	public ResponseEntity addProduct(Product prod) {
		return ResponseEntity.ok(productService.addProduct(prod));
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Optional<Product> stock = productService.getProduct(id);
        if (!stock.isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stock.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @Valid @RequestBody Product product) {
        if (!productService.getProduct(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(productService.addProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (!productService.getProduct(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        productService.deleteProduct(id);

        return ResponseEntity.ok().build();
    }
	
	

}
