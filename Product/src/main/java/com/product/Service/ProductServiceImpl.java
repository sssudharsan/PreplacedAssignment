package com.product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.DAO.ProducatDao;
import com.product.domain.Product;


@Service 
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProducatDao productDao;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public Optional<Product> getProduct(Long id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}

	@Override
	public Product addProduct(Product prod) {
		// TODO Auto-generated method stub
		return productDao.save(prod);

	}


	@Override
	public void deleteProduct(Long id) {
		productDao.deleteById(id);

	}

}
