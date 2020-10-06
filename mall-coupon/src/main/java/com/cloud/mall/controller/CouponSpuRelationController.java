package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.CouponSpuRelation;
import com.cloud.mall.service.CouponSpuRelationService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 优惠券与产品关联
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/couponspurelation")
public class CouponSpuRelationController {
    @Autowired
    private CouponSpuRelationService couponSpuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = couponSpuRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		CouponSpuRelation couponSpuRelation = couponSpuRelationService.getById(id);

        return Result.ok().put("couponSpuRelation", couponSpuRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody CouponSpuRelation couponSpuRelation){
		couponSpuRelationService.save(couponSpuRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody CouponSpuRelation couponSpuRelation){
		couponSpuRelationService.updateById(couponSpuRelation);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		couponSpuRelationService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
