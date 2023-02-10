package com.baizhi.inventory.service;

import com.baizhi.inventory.entity.Product;

public interface ProductService {
    Product queryProductById(Long id);
    int updateProduct(Product product);
}