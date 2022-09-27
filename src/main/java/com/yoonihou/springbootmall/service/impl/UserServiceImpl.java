package com.yoonihou.springbootmall.service.impl;

import com.yoonihou.springbootmall.dao.UserDao;
import com.yoonihou.springbootmall.dto.UserRegisterRequest;
import com.yoonihou.springbootmall.model.User;
import com.yoonihou.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private  final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        // 檢查註冊的 email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());
        if(user != null){
            throw new RuntimeException(String.valueOf(HttpStatus.BAD_REQUEST));
        }
        log.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail());

        // 創建帳號
        return userDao.createUser(userRegisterRequest);
    }
}
