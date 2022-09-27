package com.yoonihou.springbootmall.dao;

import com.yoonihou.springbootmall.dto.UserRegisterRequest;
import com.yoonihou.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
