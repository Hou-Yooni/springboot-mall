package com.yoonihou.springbootmall.constant;

public class MyTest {

    public static void main(String[] args) {
        ProductCategory category = ProductCategory.FOOD;
        String s = category.name(); //enum類型轉換成String

        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);
        //比對 enum類型 ProductCategory 裡面是否有跟 s2 相同的 如有 category2 就會放進 s2值(String) 因此就會變成String類型
    }
}
