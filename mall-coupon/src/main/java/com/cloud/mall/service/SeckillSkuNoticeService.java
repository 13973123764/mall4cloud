package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.SeckillSkuNotice;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageUtils queryPage(Map<String, Object> params);
}

