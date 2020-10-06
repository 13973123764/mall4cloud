package com.cloud.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.order.entity.RefundInfo;

import java.util.Map;

/**
 * 退款信息
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
public interface RefundInfoService extends IService<RefundInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

