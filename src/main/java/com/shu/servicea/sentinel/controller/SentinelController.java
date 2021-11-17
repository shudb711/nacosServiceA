package com.shu.servicea.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by shudebao@tal.com
 * @description
 * @date 2021/11/16 10:39 上午
 */

@RestController
@RequestMapping("/sentinel")
@Slf4j
public class SentinelController {


    @GetMapping("/flow")
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void flow() throws InterruptedException {
        System.out.println("spend 1s to execute method flow()");
//        Thread.sleep(1000);
        throw new RuntimeException("exception occur");
    }

    public void blockHandler() {
        System.out.println("flow blockHandler");
    }

    public void fallback() {
        System.out.println("flow fallback");
    }

}
