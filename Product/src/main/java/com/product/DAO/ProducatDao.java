package com.product.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.product.domain.Product;

public interface ProducatDao extends JpaRepository<Product, Long> {
	
	

}
