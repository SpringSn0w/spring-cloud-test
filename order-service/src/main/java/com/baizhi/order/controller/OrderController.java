package com.baizhi.order.controller;

import com.baizhi.order.entity.Order;
import com.baizhi.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {

   @Autowired
   private OrderService orderService;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }

    @PostMapping
    public int createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
}