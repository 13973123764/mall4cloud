package com.cloud.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.product.entity.SpuImages;

import java.util.Map;

/**
 * spu图片
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageUtils queryPage(Map<String, Object> params);
}

