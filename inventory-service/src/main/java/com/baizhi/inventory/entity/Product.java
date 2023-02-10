package com.baizhi.inventory.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Long id;
    private String name;
    private Long price;
    private Integer stock;
    private String description;
    
}