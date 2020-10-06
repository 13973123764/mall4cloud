package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.Category;
import com.cloud.mall.product.service.CategoryService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 商品三级分类
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public Result info(@PathVariable("catId") Long catId){
		Category category = categoryService.getById(catId);

        return Result.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody Category category){
		categoryService.save(category);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Category category){
		categoryService.updateById(category);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));
        return Result.ok();
    }

}
