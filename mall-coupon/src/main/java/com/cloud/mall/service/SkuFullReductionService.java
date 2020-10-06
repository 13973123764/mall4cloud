package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.SkuFullReduction;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
public interface SkuFullReductionService extends IService<SkuFullReduction> {

    PageUtils queryPage(Map<String, Object> params);
}

