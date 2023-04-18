package com.example.demo.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Controller
public class LoginController {
    @RequestMapping("/index")
    public String index() {
        return "mylogin222.html";
    }
    @RequestMapping("/hello")
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

}