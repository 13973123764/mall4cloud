package com.cloud.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.order.entity.OrderOperateHistory;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

