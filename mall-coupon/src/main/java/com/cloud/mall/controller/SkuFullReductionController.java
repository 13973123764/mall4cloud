package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.SkuFullReduction;
import com.cloud.mall.service.SkuFullReductionService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 商品满减信息
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/skufullreduction")
public class SkuFullReductionController {
    @Autowired
    private SkuFullReductionService skuFullReductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = skuFullReductionService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SkuFullReduction skuFullReduction = skuFullReductionService.getById(id);

        return Result.ok().put("skuFullReduction", skuFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SkuFullReduction skuFullReduction){
		skuFullReductionService.save(skuFullReduction);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SkuFullReduction skuFullReduction){
		skuFullReductionService.updateById(skuFullReduction);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		skuFullReductionService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
