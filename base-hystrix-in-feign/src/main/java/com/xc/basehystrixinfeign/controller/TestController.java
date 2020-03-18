package com.xc.basehystrixinfeign.controller;

import com.xc.basehystrixinfeign.feign.TestFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestFeign testFeign;

    @GetMapping("/feignInfo/{tmp}")
    public String feignInfo(@PathVariable String tmp) {
        String message = testFeign.getInfo(tmp);
        return "获取到的信息:" + message;
    }

}
