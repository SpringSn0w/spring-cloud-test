package com.baizhi.order.entity;

import lombok.Data;
import com.baizhi.user.entity.User;

@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;
    private Long productId;
}