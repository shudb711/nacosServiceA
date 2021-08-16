package com.shu.servicea.controller;

import com.shu.servicea.feign.ServiceBService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author by shudebao@tal.com
 * @description
 * @date 2021/8/11 2:36 下午
 */

@RestController
public class ServiceADemoController {

    @Resource
    private ServiceBService serviceBService;

    @Value("${test.name}")
    private String name;

    @GetMapping("/test/requestToServiceB")
    public void test() {
        serviceBService.hello(name);
    }
}
