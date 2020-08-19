package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Guo
 * @Create 2020/8/18 17:16
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease (@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}