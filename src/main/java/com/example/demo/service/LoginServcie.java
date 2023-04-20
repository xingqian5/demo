package com.example.demo.service;

import com.example.demo.domain.ResponseResult;
import com.example.demo.entity.User;

public interface LoginServcie {
    public ResponseResult login(User user);
}
