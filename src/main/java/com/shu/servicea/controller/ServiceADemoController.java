package com.shu.servicea.controller;

import com.shu.servicea.feign.ServiceBService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

//    @Resource
//    private RestTemplate restTemplate;

    @Value("${test.name}")
    private String name;

    @GetMapping("/test/requestToServiceB")
    public void test() {
//        serviceBService.hello(name);
        System.out.println(11111);
//        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://serviceB/serviceB/hello?name={1}", String.class, name);
//        System.out.println(forEntity.getBody());
    }
}
