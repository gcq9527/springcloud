package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Guo
 * @Create 2020/7/13 9:42
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain84 {
  public static void main(String[] args) {
      SpringApplication.run(OrderNacosMain84.class, args);
  }
}