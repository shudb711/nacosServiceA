package com.shu.servicea.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author by shudebao@tal.com
 * @description
 * @date 2021/8/11 2:39 下午
 */

@FeignClient(name = "serviceB")
public interface ServiceBService {

    @GetMapping("serviceB/hello")
    public void hello(@RequestParam String name);
}
