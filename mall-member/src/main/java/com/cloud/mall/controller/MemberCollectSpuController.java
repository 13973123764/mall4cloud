package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.MemberCollectSpu;
import com.cloud.mall.service.MemberCollectSpuService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 会员收藏的商品
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
@RestController
@RequestMapping("member/membercollectspu")
public class MemberCollectSpuController {
    @Autowired
    private MemberCollectSpuService memberCollectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = memberCollectSpuService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		MemberCollectSpu memberCollectSpu = memberCollectSpuService.getById(id);

        return Result.ok().put("memberCollectSpu", memberCollectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody MemberCollectSpu memberCollectSpu){
		memberCollectSpuService.save(memberCollectSpu);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody MemberCollectSpu memberCollectSpu){
		memberCollectSpuService.updateById(memberCollectSpu);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		memberCollectSpuService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
