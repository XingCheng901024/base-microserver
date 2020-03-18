package com.xc.basehystrixinribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    @GetMapping("/provider/{id}")
    public String getProviderById(@PathVariable Long id){
        String tmp = id.toString();
        return this.restTemplate.getForObject("http://base-provider/book/"+tmp,String.class);
    }

    public String testError(Long id) {
        String tmp = id.toString();
        return tmp + " -hi Hystrix : sorry error!";
    }

}
