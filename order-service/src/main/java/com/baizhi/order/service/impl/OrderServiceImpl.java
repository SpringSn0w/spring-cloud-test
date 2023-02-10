package com.baizhi.order.service.impl;

import com.baizhi.order.entity.Order;
import com.baizhi.order.mapper.OrderMapper;
import com.baizhi.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    public Order queryOrderById(Long orderId) {
        return orderMapper.findOrderById(orderId);
    }

    @Override
    @Transactional
    public int createOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

}