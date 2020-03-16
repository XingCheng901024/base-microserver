package com.xc.basefeign.controller;

import com.xc.basefeign.feign.EurekaFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @GetMapping("/feignInfo/{tmp}")
    public String feignInfo(@PathVariable String tmp) {
        String message = eurekaFeignService.getInfo(tmp);
        return "获取到的信息:" + message;
    }

}