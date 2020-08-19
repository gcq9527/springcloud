package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Guo
 * @Create 2020/8/16 15:51
 */
@Slf4j
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return  "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + ".....testB");
        return  "----testB";
    }

    @GetMapping("/testD")
    public String testD() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//
//        }
//        log.info("testD 测试RT");
        log.info("testD 异常比列");
        int a = 10/0;
        return  "----testD";
    }


    @GetMapping("/testE")
    public String testE() {
//        log.info(Thread.currentThread().getName() + "\t" + ".....testB");
        log.info("testE 测试异常数数");
        int age = 10/0;
        return  "----testE 测试异常数";
    }

    @GetMapping("/testHotkey")
    @SentinelResource(value = "testHotkey")
    public String testHotkey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        return "-----testHotkey";
    }
    /**
     * 兜底方法
     * @param p1
     * @param p2
     * @param blockException
     * @return
     */
    public String deal_testHotKey(String p1, String p2, BlockException blockException) {
        return "-----deal_testHotKey/(ㄒoㄒ)/~~"; //sentinel系统默认提示
    }
}