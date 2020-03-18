package com.xc.basehystrixinfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "base-provider",fallback = TestFeignImpl.class)
public interface TestFeign {
    @RequestMapping(value = "/book/{tmp}")
    String getInfo(@PathVariable(value="tmp") String tmp);
}
