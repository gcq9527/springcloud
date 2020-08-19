package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Guo
 * @Create 2020/7/6 16:23
 */
@Mapper
public interface PaymentDao1 {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}