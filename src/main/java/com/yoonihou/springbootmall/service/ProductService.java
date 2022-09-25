package com.yoonihou.springbootmall.service;


import com.yoonihou.springbootmall.dto.ProductQueryParams;
import com.yoonihou.springbootmall.dto.ProductRequest;
import com.yoonihou.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer product);
}
