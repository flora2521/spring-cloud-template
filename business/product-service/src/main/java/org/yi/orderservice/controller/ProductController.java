package org.yi.orderservice.controller;

import brave.Tracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/5/28 16:17
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Tracer tracer;
    /**
     * 商品服务
     */
    @GetMapping("/service")
    public String productService() {
        logger.info("Product Service Is Called...");
        tracer.currentSpan().tag("自定义","邹强");
        return "Product Service Is Called...";
    }

}

