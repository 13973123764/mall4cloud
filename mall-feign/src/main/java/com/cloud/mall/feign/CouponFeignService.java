package com.cloud.mall.feign;

import com.cloud.mall.common.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "mall-coupon")
public interface CouponFeignService {

    @GetMapping("coupon/coupon/member/list")
    Result list();
}
