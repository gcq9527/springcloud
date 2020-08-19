package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Guo
 * @Create 2020/7/6 12:32
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}