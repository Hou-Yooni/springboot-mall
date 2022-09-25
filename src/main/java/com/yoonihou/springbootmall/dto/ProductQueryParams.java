package com.yoonihou.springbootmall.dto;

import com.yoonihou.springbootmall.constant.ProductCategory;
import lombok.Data;


@Data
public class ProductQueryParams {
    private ProductCategory category;
    private String search;
    private String orderBy;
    private String sort;
}
