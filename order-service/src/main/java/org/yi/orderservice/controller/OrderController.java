package org.yi.orderservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yi.orderservice.fegin.ProductClient;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/5/28 16:25
 */

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ProductClient productClient;

    @GetMapping(value = "/service")
    public String orderService() {
        logger.info("Order Service Is Called...");
        String ret = productClient.productService();
        logger.info(ret.toString());
        return "Order Service Is Called...";
    }
}

