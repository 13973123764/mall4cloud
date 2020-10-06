package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.HomeAdv;
import com.cloud.mall.service.HomeAdvService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 首页轮播广告
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/homeadv")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		HomeAdv homeAdv = homeAdvService.getById(id);

        return Result.ok().put("homeAdv", homeAdv);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody HomeAdv homeAdv){
		homeAdvService.save(homeAdv);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody HomeAdv homeAdv){
		homeAdvService.updateById(homeAdv);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		homeAdvService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
