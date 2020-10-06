package com.cloud.mall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.mall.entity.HomeSubject;
import com.cloud.mall.service.HomeSubjectService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Result;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链?有碌囊趁妫故咀ㄌ馍唐沸畔ⅰ
 *
 * @authoResult zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@RestController
@RequestMapping("coupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = homeSubjectService.queryPage(params);

        return Result.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
		HomeSubject homeSubject = homeSubjectService.getById(id);

        return Result.ok().put("homeSubject", homeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody HomeSubject homeSubject){
		homeSubjectService.save(homeSubject);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody HomeSubject homeSubject){
		homeSubjectService.updateById(homeSubject);
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
		homeSubjectService.removeByIds(Arrays.asList(ids));
        return Result.ok();
    }

}
