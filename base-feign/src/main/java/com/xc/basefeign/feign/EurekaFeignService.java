package com.xc.basefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "base-provider") // 调用的服务的名称
public interface EurekaFeignService {

    @RequestMapping(value = "/book/{tmp}")
    String getInfo(@PathVariable(value="tmp") String tmp);

}