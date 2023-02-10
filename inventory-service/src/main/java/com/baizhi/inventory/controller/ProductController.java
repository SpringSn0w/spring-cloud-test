package com.baizhi.inventory.controller;

import com.baizhi.inventory.entity.Product;
import com.baizhi.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public Product queryProductById(@PathVariable Long id){
        return productService.queryProductById(id);
    }
    @PutMapping("{id}")
    public int updateProduct(@PathVariable Long id,
                             @RequestBody Product product){
        product.setId(id);
        return productService.updateProduct(product);
    }
}