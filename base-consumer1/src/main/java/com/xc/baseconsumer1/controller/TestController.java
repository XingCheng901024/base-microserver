package com.xc.baseconsumer1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${version}")
    private String version;

    @Value("${demo.message}")
    private String message;

    @Value("${date}")
    private String date;

    @RequestMapping(value = "/config-test", method = RequestMethod.GET)
    public String clientTest() {
        return "get github config version:" + version + " message:"+message + " date:" +date;
    }

}
