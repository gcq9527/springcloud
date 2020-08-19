package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Guo
 * @Create 2020/8/18 15:51
 */
@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    void update(@Param("userId") Long userId, @Param("status") Integer status);
}