package com.cloud.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.order.entity.PaymentInfo;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

