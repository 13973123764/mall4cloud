package com.cloud.mall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.ware.entity.PurchaseDetail;
import com.cloud.mall.ware.service.PurchaseDetailService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:56:34
 */
@RestController
@RequestMapping("ware/purchasedetail")
public class PurchaseDetailController {
    @Autowired
    private PurchaseDetailService purchaseDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = purchaseDetailService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		PurchaseDetail purchaseDetail = purchaseDetailService.getById(id);

        return Result.ok().put("purchaseDetail", purchaseDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody PurchaseDetail purchaseDetail){
		purchaseDetailService.save(purchaseDetail);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody PurchaseDetail purchaseDetail){
		purchaseDetailService.updateById(purchaseDetail);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		purchaseDetailService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
