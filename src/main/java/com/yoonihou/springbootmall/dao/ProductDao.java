package com.yoonihou.springbootmall.dao;

import com.yoonihou.springbootmall.constant.ProductCategory;
import com.yoonihou.springbootmall.dto.ProductQueryParams;
import com.yoonihou.springbootmall.dto.ProductRequest;
import com.yoonihou.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProduct(Integer productId);
}
