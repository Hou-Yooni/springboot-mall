package com.yoonihou.springbootmall.dao;

import com.yoonihou.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
