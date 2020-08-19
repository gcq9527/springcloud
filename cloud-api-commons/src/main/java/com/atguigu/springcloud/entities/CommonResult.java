package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Guo
 * @Create 2020/7/6 12:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String menssage;
    private T data;

    public CommonResult(Integer code,String message) {
        this(code,message,null);
    }
}