package com.cloud.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.order.entity.OrderReturnReason;

import java.util.Map;

/**
 * 退货原因
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
public interface OrderReturnReasonService extends IService<OrderReturnReason> {

    PageUtils queryPage(Map<String, Object> params);
}

