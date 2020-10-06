package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.MemberStatisticsInfo;
import com.cloud.mall.service.MemberStatisticsInfoService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 会员统计信
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
@RestController
@RequestMapping("member/memberstatisticsinfo")
public class MemberStatisticsInfoController {
    @Autowired
    private MemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = memberStatisticsInfoService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		MemberStatisticsInfo memberStatisticsInfo = memberStatisticsInfoService.getById(id);

        return Result.ok().put("memberStatisticsInfo", memberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody MemberStatisticsInfo memberStatisticsInfo){
		memberStatisticsInfoService.save(memberStatisticsInfo);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody MemberStatisticsInfo memberStatisticsInfo){
		memberStatisticsInfoService.updateById(memberStatisticsInfo);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		memberStatisticsInfoService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
