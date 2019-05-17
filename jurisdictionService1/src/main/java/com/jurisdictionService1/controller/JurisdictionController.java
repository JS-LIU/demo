package com.jurisdictionService1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JurisdictionController {
    @RequestMapping("/getJurisdiction.do")
    public Map getJurisdiction(){

        Map<String,Object> map = new HashMap<>();
        map.put("jurisdiction1","value");
        return map;
    }
}
