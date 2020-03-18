package com.xc.basehystrixinfeign.feign;

import org.springframework.stereotype.Component;

@Component
public class TestFeignImpl implements TestFeign {
    @Override
    public String getInfo(String tmp) {
        return "TestFeignImpl: sorry, it's an error!";
    }
}
