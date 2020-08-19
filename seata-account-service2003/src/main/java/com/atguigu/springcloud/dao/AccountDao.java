package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Guo
 * @Create 2020/8/18 17:09
 */
@Mapper
public interface AccountDao {

    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal moeny);
}