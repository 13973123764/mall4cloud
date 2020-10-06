package com.cloud.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.order.entity.OrderReturnApply;
import com.cloud.mall.order.service.OrderReturnApplyService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 订单退货申请
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
@RestController
@RequestMapping("order/orderreturnapply")
public class OrderReturnApplyController {
    @Autowired
    private OrderReturnApplyService orderReturnApplyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = orderReturnApplyService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		OrderReturnApply orderReturnApply = orderReturnApplyService.getById(id);

        return Result.ok().put("orderReturnApply", orderReturnApply);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody OrderReturnApply orderReturnApply){
		orderReturnApplyService.save(orderReturnApply);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody OrderReturnApply orderReturnApply){
		orderReturnApplyService.updateById(orderReturnApply);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		orderReturnApplyService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
