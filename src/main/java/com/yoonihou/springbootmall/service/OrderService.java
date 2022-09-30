package com.yoonihou.springbootmall.service;

import com.yoonihou.springbootmall.dto.CreateOrderRequest;
import com.yoonihou.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
