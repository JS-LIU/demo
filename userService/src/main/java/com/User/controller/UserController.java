package com.User.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/getUser")
    public String getUser(){
        return "USER";
    }


    @RequestMapping("/getJurisdiction")
    public Object getJurisdiction(){
        return restTemplate.getForObject("http://localhost:9000/getJurisdiction.do",Object.class);
    }

    @GetMapping("/getUserName")
    public String getUserName(){
        return "HELLO FEIGN";
    }
}
