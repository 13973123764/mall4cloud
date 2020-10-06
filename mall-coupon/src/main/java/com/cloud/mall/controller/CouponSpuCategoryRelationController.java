package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.CouponSpuCategoryRelation;
import com.cloud.mall.service.CouponSpuCategoryRelationService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 优惠券分类关联
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/couponspucategoryrelation")
public class CouponSpuCategoryRelationController {
    @Autowired
    private CouponSpuCategoryRelationService couponSpuCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = couponSpuCategoryRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		CouponSpuCategoryRelation couponSpuCategoryRelation = couponSpuCategoryRelationService.getById(id);

        return Result.ok().put("couponSpuCategoryRelation", couponSpuCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody CouponSpuCategoryRelation couponSpuCategoryRelation){
		couponSpuCategoryRelationService.save(couponSpuCategoryRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody CouponSpuCategoryRelation couponSpuCategoryRelation){
		couponSpuCategoryRelationService.updateById(couponSpuCategoryRelation);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		couponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
