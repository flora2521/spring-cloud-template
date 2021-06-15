package org.yi.orderservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yi.orderservice.fegin.ProductClient;
import org.yi.orderservice.mapper.UserMapper;
import org.yi.orderservice.module.entity.UserEntity;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/5/28 16:25
 */

@Slf4j
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/service")
    public String orderService() {
        log.info("Order Service Is Called...");
        String ret = productClient.productService();
        log.info(ret.toString());
        return "Order Service Is Called...";
    }

    @GetMapping(value = "/send-log")
    public String sendLog() {
        log.info("发送日志开始");
        log.info("发送日志结束");
        return "发送日志结束";
    }

    @GetMapping(value = "/user")
    public UserEntity selectOneUser(Long id) {
        return userMapper.selectOne(id);
    }
}

