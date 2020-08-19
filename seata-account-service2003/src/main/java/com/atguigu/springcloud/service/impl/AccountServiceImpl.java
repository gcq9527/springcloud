package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.AccountDao;
import com.atguigu.springcloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author Guo
 * @Create 2020/8/18 17:18
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("----->account-service中扣减账余额开始");
        //模拟超时异常
        try { TimeUnit.SECONDS.sleep(20);} catch (InterruptedException e){e.printStackTrace();}
        accountDao.decrease(userId,money);
        LOGGER.info("----->account-service中扣减账户余额结束");

    }
}