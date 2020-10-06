package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.SeckillPromotion;
import com.cloud.mall.service.SeckillPromotionService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 秒杀活动
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/seckillpromotion")
public class SeckillPromotionController {
    @Autowired
    private SeckillPromotionService seckillPromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillPromotionService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SeckillPromotion seckillPromotion = seckillPromotionService.getById(id);

        return Result.ok().put("seckillPromotion", seckillPromotion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SeckillPromotion seckillPromotion){
		seckillPromotionService.save(seckillPromotion);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SeckillPromotion seckillPromotion){
		seckillPromotionService.updateById(seckillPromotion);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		seckillPromotionService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
