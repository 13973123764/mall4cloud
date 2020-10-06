package com.cloud.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.order.entity.OrderSetting;
import com.cloud.mall.order.service.OrderSettingService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 订单配置信息
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
@RestController
@RequestMapping("order/ordersetting")
public class OrderSettingController {
    @Autowired
    private OrderSettingService orderSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = orderSettingService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		OrderSetting orderSetting = orderSettingService.getById(id);

        return Result.ok().put("orderSetting", orderSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody OrderSetting orderSetting){
		orderSettingService.save(orderSetting);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody OrderSetting orderSetting){
		orderSettingService.updateById(orderSetting);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		orderSettingService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
