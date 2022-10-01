package com.yoonihou.springbootmall.service;

import com.yoonihou.springbootmall.dto.CreateOrderRequest;
import com.yoonihou.springbootmall.dto.OrderQueryParams;
import com.yoonihou.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
