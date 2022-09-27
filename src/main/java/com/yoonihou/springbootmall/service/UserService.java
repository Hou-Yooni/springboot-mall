package com.yoonihou.springbootmall.service;

import com.yoonihou.springbootmall.dto.UserLoginRequest;
import com.yoonihou.springbootmall.dto.UserRegisterRequest;
import com.yoonihou.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);
}
