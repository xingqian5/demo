package com.example.demo.controller;

import com.example.demo.domain.ResponseResult;
import com.example.demo.entity.User;
import com.example.demo.service.LoginServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class LoginController {
    @RequestMapping("/index")
    public String index() {
        return "mylogin222.html";
    }
    @RequestMapping("/hello1")
    public String hello() {
        return "hello spring security";
    }
    @RequestMapping("/mylogin.html")
    public String mylogin() {
        return "mylogin";
    }
    @GetMapping("/user")
    public void userInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        System.out.println("name = " + name);
        System.out.println("authorities = " + authorities);
    }
    @RequestMapping("/hello")
    public String hello1(){
        return "hello";
    }
    @Autowired
    private LoginServcie loginServcie;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return loginServcie.login(user);
    }

}