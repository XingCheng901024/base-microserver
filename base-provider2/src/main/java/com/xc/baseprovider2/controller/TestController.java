package com.xc.baseprovider2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/book/{tmp}")
    public String getBookById(@PathVariable String tmp){
        return tmp+" :hello baseprovider2";
    }

}
