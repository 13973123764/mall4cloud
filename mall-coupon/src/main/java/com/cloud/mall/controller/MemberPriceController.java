package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.MemberPrice;
import com.cloud.mall.service.MemberPriceService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 商品会员价格
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/memberprice")
public class MemberPriceController {
    @Autowired
    private MemberPriceService memberPriceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = memberPriceService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		MemberPrice memberPrice = memberPriceService.getById(id);

        return Result.ok().put("memberPrice", memberPrice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody MemberPrice memberPrice){
		memberPriceService.save(memberPrice);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody MemberPrice memberPrice){
		memberPriceService.updateById(memberPrice);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		memberPriceService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
