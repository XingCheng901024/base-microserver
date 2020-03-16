package com.xc.basehystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHystrixDashboard
public class TestController {

    @RequestMapping(value = "/hystrix-test", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallbackClientTest")
    public String clientTest() {
        return "get github config version:" ;
    }

    private String fallbackClientTest(){
        return "20200313";
    }

}
