package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.domain.CommonResult;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Guo
 * @Create 2020/8/18 16:20
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping(value = "/storage/decrease",method = RequestMethod.POST)
    public CommonResult decrase(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功");
    }
}