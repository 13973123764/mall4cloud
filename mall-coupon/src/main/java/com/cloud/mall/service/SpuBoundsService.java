package com.cloud.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.entity.SpuBounds;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:47
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageUtils queryPage(Map<String, Object> params);
}

