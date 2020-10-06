package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.HomeSubject;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链?有碌囊趁妫故咀ㄌ馍唐沸畔ⅰ
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
public interface HomeSubjectService extends IService<HomeSubject> {

    PageUtils queryPage(Map<String, Object> params);
}

