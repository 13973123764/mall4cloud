package com.cloud.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.ware.entity.WareSku;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:56:34
 */
public interface WareSkuService extends IService<WareSku> {

    PageUtils queryPage(Map<String, Object> params);
}

