package com.tienphat29.productservice.services;

import com.tienphat29.productservice.entities.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product findById(Long id);
    List<Product> findAll();
    void updateStock(Long id, Integer quantity);
}
