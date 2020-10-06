package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cloud.mall.entity.Coupon;
import com.cloud.mall.service.CouponService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;

/**
 * 优惠券信息
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/member/list")
    public Result list(){
        return Result.ok("hello");
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);
        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		Coupon coupon = couponService.getById(id);

        return Result.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody Coupon coupon){
		couponService.save(coupon);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Coupon coupon){
		couponService.updateById(coupon);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
