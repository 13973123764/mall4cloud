package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.MemberCollectSubject;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageUtils queryPage(Map<String, Object> params);
}

