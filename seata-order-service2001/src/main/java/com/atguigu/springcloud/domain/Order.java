package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Guo
 * @Create 2020/8/18 15:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;

    private Long userId;

    private Long productId;
    private Integer count;
    private BigDecimal money;
    /**
     * 订单状态
     */
    private Integer status;
}