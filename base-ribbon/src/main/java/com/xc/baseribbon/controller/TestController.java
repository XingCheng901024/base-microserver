package com.xc.baseribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/restful/{id}")
    public String getRestfulById(@PathVariable Long id){
        String tmp = id.toString();
        return this.restTemplate.getForObject("http://base-ribbon/book/"+tmp,String.class);
    }

    @GetMapping("/provider/{id}")
    public String getProviderById(@PathVariable Long id){
        String tmp = id.toString();
        return this.restTemplate.getForObject("http://base-provider/book/"+tmp,String.class);
    }

    @GetMapping("/book/{tmp}")
    public String getBookById(@PathVariable String tmp){
        return tmp+" :hello xingcheng";
    }

}
