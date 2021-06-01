package org.yi.sentinelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yi.sentinelservice.service.GoodsQueryService;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/1 17:33
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsQueryService goodsQueryService;

    @RequestMapping("")
    @ResponseBody
    public String queryGoodsInfo(@RequestParam("spuId") String spuId) {
        return goodsQueryService.queryGoodsInfo(spuId);
    }
}

