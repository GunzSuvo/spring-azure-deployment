package com.datajpa.springboot.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.springboot.entity.Product;
import com.datajpa.springboot.service.ProductService;


@RestController
@RequestMapping("/api/products")
public class ProductController {

	private final ProductService productService;

    // Constructor injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    
    @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
}
