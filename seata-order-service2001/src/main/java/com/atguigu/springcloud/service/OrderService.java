package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @author Guo
 * @Create 2020/8/18 16:03
 */
public interface OrderService {
    void create(Order order);
}