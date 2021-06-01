package org.yi.sentinelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yi.sentinelservice.service.OrderQueryService;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/1 16:12
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderQueryService orderQueryService;

    @RequestMapping("")
    @ResponseBody
    public String queryOrder(@RequestParam("orderId") String orderId) {
        return orderQueryService.queryOrderInfo(orderId);
    }
}

