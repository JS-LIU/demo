package com.jurisdiction.feignClientsInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user")
public interface UserInterface {
    @RequestMapping("/getUserName")
    String getUserName();
}
