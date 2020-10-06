package com.cloud.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.order.entity.OrderItem;
import com.cloud.mall.order.service.OrderItemService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 订单项信息
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
@RestController
@RequestMapping("order/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = orderItemService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		OrderItem orderItem = orderItemService.getById(id);

        return Result.ok().put("orderItem", orderItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody OrderItem orderItem){
		orderItemService.save(orderItem);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody OrderItem orderItem){
		orderItemService.updateById(orderItem);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		orderItemService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
