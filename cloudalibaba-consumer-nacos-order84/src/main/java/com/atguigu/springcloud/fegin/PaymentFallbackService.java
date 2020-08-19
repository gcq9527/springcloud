package com.atguigu.springcloud.fegin;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Guo
 * @Create 2020/8/17 17:21
 */
@Component
public class PaymentFallbackService implements PaymentFeginService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,---PaymentFallbackService",new Payment(id,"error"));
    }
}