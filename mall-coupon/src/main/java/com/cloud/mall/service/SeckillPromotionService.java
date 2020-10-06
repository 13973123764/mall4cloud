package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.SeckillPromotion;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
public interface SeckillPromotionService extends IService<SeckillPromotion> {

    PageUtils queryPage(Map<String, Object> params);
}

