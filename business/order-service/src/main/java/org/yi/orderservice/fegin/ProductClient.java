package org.yi.orderservice.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/5/28 16:21
 */
@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/api/v1/product/service")
    public String productService();

}

