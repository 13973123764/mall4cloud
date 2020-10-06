package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.SeckillSkuRelation;
import com.cloud.mall.service.SeckillSkuRelationService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 秒杀活动商品关联
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/seckillskurelation")
public class SeckillSkuRelationController {
    @Autowired
    private SeckillSkuRelationService seckillSkuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillSkuRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SeckillSkuRelation seckillSkuRelation = seckillSkuRelationService.getById(id);

        return Result.ok().put("seckillSkuRelation", seckillSkuRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SeckillSkuRelation seckillSkuRelation){
		seckillSkuRelationService.save(seckillSkuRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SeckillSkuRelation seckillSkuRelation){
		seckillSkuRelationService.updateById(seckillSkuRelation);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		seckillSkuRelationService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
