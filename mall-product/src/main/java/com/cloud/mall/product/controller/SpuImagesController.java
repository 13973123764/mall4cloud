package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.SpuImages;
import com.cloud.mall.product.service.SpuImagesService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * spu图片
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
@RestController
@RequestMapping("product/spuimages")
public class SpuImagesController {
    @Autowired
    private SpuImagesService spuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = spuImagesService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SpuImages spuImages = spuImagesService.getById(id);

        return Result.ok().put("spuImages", spuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SpuImages spuImages){
		spuImagesService.save(spuImages);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SpuImages spuImages){
		spuImagesService.updateById(spuImages);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		spuImagesService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
