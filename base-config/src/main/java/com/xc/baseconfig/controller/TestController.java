package com.xc.baseconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${date}")
    private String version;

    @Value("${time.hour}")
    private String message;

    @RequestMapping(value = "/config-test", method = RequestMethod.GET)
    public String clientTest() {
        return "get github config version:" + version + " message:"+message;
    }

}
