package com.datajpa.springboot.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.datajpa.springboot.entity.Product;
import com.datajpa.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
