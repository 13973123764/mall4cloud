package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.HomeSubjectSpu;
import com.cloud.mall.service.HomeSubjectSpuService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 专题商品
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/homesubjectspu")
public class HomeSubjectSpuController {
    @Autowired
    private HomeSubjectSpuService homeSubjectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = homeSubjectSpuService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		HomeSubjectSpu homeSubjectSpu = homeSubjectSpuService.getById(id);

        return Result.ok().put("homeSubjectSpu", homeSubjectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody HomeSubjectSpu homeSubjectSpu){
		homeSubjectSpuService.save(homeSubjectSpu);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody HomeSubjectSpu homeSubjectSpu){
		homeSubjectSpuService.updateById(homeSubjectSpu);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		homeSubjectSpuService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
