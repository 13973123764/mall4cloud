package com.cloud.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.product.entity.SkuSaleAttrValue;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:58
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

