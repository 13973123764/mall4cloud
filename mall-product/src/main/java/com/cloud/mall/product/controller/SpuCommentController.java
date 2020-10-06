package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.SpuComment;
import com.cloud.mall.product.service.SpuCommentService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 商品评价
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:58
 */
@RestController
@RequestMapping("product/spucomment")
public class SpuCommentController {
    @Autowired
    private SpuCommentService spuCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = spuCommentService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SpuComment spuComment = spuCommentService.getById(id);

        return Result.ok().put("spuComment", spuComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SpuComment spuComment){
		spuCommentService.save(spuComment);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SpuComment spuComment){
		spuCommentService.updateById(spuComment);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		spuCommentService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
