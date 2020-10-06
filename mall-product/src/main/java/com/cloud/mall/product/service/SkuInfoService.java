package com.cloud.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.product.entity.SkuInfo;

import java.util.Map;

/**
 * sku信息
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:58
 */
public interface SkuInfoService extends IService<SkuInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

