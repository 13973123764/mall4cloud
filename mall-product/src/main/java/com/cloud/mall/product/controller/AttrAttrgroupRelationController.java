package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.AttrAttrgroupRelation;
import com.cloud.mall.product.service.AttrAttrgroupRelationService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 属性&属性分组关联
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
@RestController
@RequestMapping("product/attrattrgrouprelation")
public class AttrAttrgroupRelationController {
    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = attrAttrgroupRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		AttrAttrgroupRelation attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

        return Result.ok().put("attrAttrgroupRelation", attrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
		attrAttrgroupRelationService.save(attrAttrgroupRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
		attrAttrgroupRelationService.updateById(attrAttrgroupRelation);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
