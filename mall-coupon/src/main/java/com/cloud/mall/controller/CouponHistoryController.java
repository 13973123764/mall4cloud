package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.CouponHistory;
import com.cloud.mall.service.CouponHistoryService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 优惠券领取历史记录
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/couponhistory")
public class CouponHistoryController {
    @Autowired
    private CouponHistoryService couponHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = couponHistoryService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		CouponHistory couponHistory = couponHistoryService.getById(id);

        return Result.ok().put("couponHistory", couponHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody CouponHistory couponHistory){
		couponHistoryService.save(couponHistory);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody CouponHistory couponHistory){
		couponHistoryService.updateById(couponHistory);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		couponHistoryService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
