package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.SkuImages;
import com.cloud.mall.product.service.SkuImagesService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * sku图片
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:58
 */
@RestController
@RequestMapping("product/skuimages")
public class SkuImagesController {
    @Autowired
    private SkuImagesService skuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = skuImagesService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SkuImages skuImages = skuImagesService.getById(id);

        return Result.ok().put("skuImages", skuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SkuImages skuImages){
		skuImagesService.save(skuImages);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SkuImages skuImages){
		skuImagesService.updateById(skuImages);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		skuImagesService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
