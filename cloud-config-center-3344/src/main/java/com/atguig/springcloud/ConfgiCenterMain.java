package com.atguig.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Guo
 * @Create 2020/7/10 16:21
 */
@SpringBootApplication
@EnableConfigServer
public class ConfgiCenterMain {
   public static void main(String[] args) {
       SpringApplication.run(ConfgiCenterMain.class, args);
   }
}