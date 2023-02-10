package com.baizhi.inventory.service.impl;

import com.baizhi.inventory.entity.Product;
import com.baizhi.inventory.mapper.ProductMapper;
import com.baizhi.inventory.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public Product queryProductById(Long id) {
        return productMapper.findProductById(id);
    }

    @Override
    @Transactional
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }
}