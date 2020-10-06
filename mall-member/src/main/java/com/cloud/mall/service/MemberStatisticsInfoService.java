package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.MemberStatisticsInfo;

import java.util.Map;

/**
 * 会员统计信
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

