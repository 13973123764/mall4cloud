package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.SeckillSkuNotice;
import com.cloud.mall.service.SeckillSkuNoticeService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 秒杀商品通知订阅
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/seckillskunotice")
public class SeckillSkuNoticeController {
    @Autowired
    private SeckillSkuNoticeService seckillSkuNoticeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillSkuNoticeService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		SeckillSkuNotice seckillSkuNotice = seckillSkuNoticeService.getById(id);

        return Result.ok().put("seckillSkuNotice", seckillSkuNotice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody SeckillSkuNotice seckillSkuNotice){
		seckillSkuNoticeService.save(seckillSkuNotice);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SeckillSkuNotice seckillSkuNotice){
		seckillSkuNoticeService.updateById(seckillSkuNotice);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		seckillSkuNoticeService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
