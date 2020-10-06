package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import com.cloud.mall.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cloud.mall.entity.Member;
import com.cloud.mall.service.MemberService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 会员
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
@RestController
@RequestMapping("/member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    CouponFeignService couponFeignService;

    @GetMapping("/testList")
    public Result testList(){
        Result list = couponFeignService.list();
        System.out.println("list = " + list);
        return list;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);
        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		Member member = memberService.getById(id);

        return Result.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody Member member){
		memberService.save(member);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Member member){
		memberService.updateById(member);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
