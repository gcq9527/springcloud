package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao1;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Guo
 * @Create 2020/7/6 12:43
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao1 paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}