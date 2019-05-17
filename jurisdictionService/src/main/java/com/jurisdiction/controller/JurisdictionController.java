package com.jurisdiction.controller;

import com.jurisdiction.feignClientsInterface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JurisdictionController {
    @Autowired
    UserInterface userInterface;


    @RequestMapping("/getJurisdiction.do")
    public Map getJurisdiction(){

        Map<String,Object> map = new HashMap<>();
        map.put("jurisdiction","value");
        return map;
    }
    @GetMapping("/getUserName")
    public String getUserName(){
        return userInterface.getUserName();
    }
}
