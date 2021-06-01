package org.yi.sentinelservice.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/1 17:26
 */
@Component
@Slf4j
public class GoodsQueryService {
    private static final String KEY = "queryGoodsInfo";

    @PostConstruct
    public static   void initDegradeRule() {
        List<DegradeRule> rules = new ArrayList<>();
        DegradeRule rule = new DegradeRule();
        rule.setResource(KEY);
        // 80s内调用接口出现异常次数超过5的时候, 进行熔断
        rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_RATIO);
        rule.setCount(1);
        rule.setTimeWindow(80);
        rules.add(rule);
        DegradeRuleManager.loadRules(rules);
    }

    /**
     * 模拟商品查询接口
     *
     * @param spuId
     * @return
     */
    @SentinelResource(value = KEY, blockHandler = "blockHandlerMethod", fallback = "queryGoodsInfoFallback")
    public String queryGoodsInfo(String spuId) {
        initDegradeRule();
        // 模拟调用服务出现异常
        if ("0".equals(spuId)) {
            throw new RuntimeException();
        }
        return "查询  商品信息 成功, " + spuId;
    }

    public String blockHandlerMethod(String spuId, BlockException e) {
        log.warn("查询商品信息 限流降级处理", e.toString());
        return "查询商品信息异常, 限流降级处理方法 res: " + spuId;

    }

    public String queryGoodsInfoFallback(String spuId, Throwable e) {
        log.warn("查询商品信息异常 fallback方法", e.toString());
        return "查询商品信息异常, 返回 fallback res: " + spuId;
    }



}
