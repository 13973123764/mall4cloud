package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.SpuInfoDesc;
import com.cloud.mall.product.service.SpuInfoDescService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * spu信息介绍
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
@RestController
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = spuInfoDescService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    public Result info(@PathVariable("spuId") Long spuId){
		SpuInfoDesc spuInfoDesc = spuInfoDescService.getById(spuId);

        return Result.ok().put("spuInfoDesc", spuInfoDesc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SpuInfoDesc spuInfoDesc){
		spuInfoDescService.save(spuInfoDesc);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SpuInfoDesc spuInfoDesc){
		spuInfoDescService.updateById(spuInfoDesc);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] spuIds){
		spuInfoDescService.removeByIds(Arrays.asList(spuIds));
        return Result.ok();
    }

}
