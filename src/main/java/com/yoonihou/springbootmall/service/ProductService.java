package com.yoonihou.springbootmall.service;


import com.yoonihou.springbootmall.dto.ProductRequest;
import com.yoonihou.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer product);
}
