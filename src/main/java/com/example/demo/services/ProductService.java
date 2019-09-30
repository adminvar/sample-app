package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Product;

public interface ProductService {
	List<Product> findAll();
	
	Optional<Product> findById(Long id);
	
	Product save(Product stock);
	
	void deleteById(Long id);
}
