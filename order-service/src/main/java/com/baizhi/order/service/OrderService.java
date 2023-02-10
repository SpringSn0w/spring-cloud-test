package com.baizhi.order.service;

import com.baizhi.order.entity.Order;

public interface OrderService {
    Order queryOrderById(Long orderId);
    int createOrder(Order order);
}