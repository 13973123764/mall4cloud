package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.MemberLevel;
import com.cloud.mall.service.MemberLevelService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 会员等级
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
@RestController
@RequestMapping("member/memberlevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = memberLevelService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		MemberLevel memberLevel = memberLevelService.getById(id);

        return Result.ok().put("memberLevel", memberLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody MemberLevel memberLevel){
		memberLevelService.save(memberLevel);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody MemberLevel memberLevel){
		memberLevelService.updateById(memberLevel);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		memberLevelService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
