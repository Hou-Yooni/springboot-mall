package com.yoonihou.springbootmall.model;


import lombok.Data;

@Data
public class OrderItem {

    private String productName;
    private String imageUrl;

    private Integer orderItemId;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private Integer amount;
}
