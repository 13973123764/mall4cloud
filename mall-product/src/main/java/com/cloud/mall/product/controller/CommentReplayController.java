package com.cloud.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.product.entity.CommentReplay;
import com.cloud.mall.product.service.CommentReplayService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 商品评价回复关系
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
@RestController
@RequestMapping("product/commentreplay")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = commentReplayService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		CommentReplay commentReplay = commentReplayService.getById(id);

        return Result.ok().put("commentReplay", commentReplay);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody CommentReplay commentReplay){
		commentReplayService.save(commentReplay);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody CommentReplay commentReplay){
		commentReplayService.updateById(commentReplay);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		commentReplayService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
