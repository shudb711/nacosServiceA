package com.shu.servicea;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author by shudebao@tal.com
 * @description
 * @date 2021/8/18 10:15 上午
 */

public class JavaTest {


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "::" + j);
                if (j == 1) {
                    break;
                }
            }
        }
    }
}
