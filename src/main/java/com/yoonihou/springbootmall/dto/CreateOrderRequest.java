package com.yoonihou.springbootmall.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class CreateOrderRequest {

    @NotEmpty
    List<BuyItem> buyItemList;
}
