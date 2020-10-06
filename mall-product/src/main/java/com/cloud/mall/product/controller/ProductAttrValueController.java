package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.ProductAttrValue;
import com.cloud.mall.product.service.ProductAttrValueService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * spu属性值
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:58
 */
@RestController
@RequestMapping("product/productattrvalue")
public class ProductAttrValueController {
    @Autowired
    private ProductAttrValueService productAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = productAttrValueService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		ProductAttrValue productAttrValue = productAttrValueService.getById(id);

        return Result.ok().put("productAttrValue", productAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody ProductAttrValue productAttrValue){
		productAttrValueService.save(productAttrValue);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody ProductAttrValue productAttrValue){
		productAttrValueService.updateById(productAttrValue);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		productAttrValueService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
