package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.MemberCollectSubject;
import com.cloud.mall.service.MemberCollectSubjectService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 会员收藏的专题活动
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
@RestController
@RequestMapping("member/membercollectsubject")
public class MemberCollectSubjectController {
    @Autowired
    private MemberCollectSubjectService memberCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = memberCollectSubjectService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		MemberCollectSubject memberCollectSubject = memberCollectSubjectService.getById(id);

        return Result.ok().put("memberCollectSubject", memberCollectSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody MemberCollectSubject memberCollectSubject){
		memberCollectSubjectService.save(memberCollectSubject);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody MemberCollectSubject memberCollectSubject){
		memberCollectSubjectService.updateById(memberCollectSubject);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		memberCollectSubjectService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
